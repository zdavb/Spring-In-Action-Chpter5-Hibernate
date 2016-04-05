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
        return sessionFactory.openSession();//��֧��getCurrentSession
    }
    @Override
    public Bound getBound(int id) {
        return (Bound)getCurrentSession().get(Bound.class,id);
    }

    @Override
    public void saveBound(Bound bound) {
        getCurrentSession().save(bound);
    }

    //ɾ������Ҫ������������
    @Override
    public void delete(Bound bound) {
        Session session = getCurrentSession();
        session.beginTransaction();
        session.delete(bound);
        session.getTransaction().commit();
    }
    //���²���Ҳ��Ҫ�������
    @Override
    public void update(Bound bound){
        Session session = getCurrentSession();
        session.beginTransaction();
        session.update(bound);
        session.getTransaction().commit();
    }
}
