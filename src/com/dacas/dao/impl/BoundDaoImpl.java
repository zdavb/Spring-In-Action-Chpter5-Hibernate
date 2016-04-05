package com.dacas.dao.impl;

import com.dacas.dao.BoundDao;
import com.dacas.data.Bound;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dave on 2016/4/5.
 */
@Repository
public class BoundDaoImpl implements BoundDao{
    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.openSession();//不支持getCurrentSession
    }
    @Override
    public Bound getBound(int id) {
        return (Bound)getCurrentSession().get(Bound.class,id);
    }

    @Override
    public void saveBound(Bound bound) {
        getCurrentSession().save(bound);
    }

    //删除操作要包裹在事务中
    @Override
    public void delete(Bound bound) {
        Session session = getCurrentSession();
        session.beginTransaction();
        session.delete(bound);
        session.getTransaction().commit();
    }
    //更新操作也需要事务包裹
    @Override
    public void update(Bound bound){
        Session session = getCurrentSession();
        session.beginTransaction();
        session.update(bound);
        session.getTransaction().commit();
    }
}
