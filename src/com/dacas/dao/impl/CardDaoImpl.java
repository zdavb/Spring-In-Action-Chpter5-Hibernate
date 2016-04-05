package com.dacas.dao.impl;

import com.dacas.dao.CardDao;
import com.dacas.data.Card;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dave on 2016/4/5.
 */
@Repository
public class CardDaoImpl implements CardDao{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        //这里不允许使用getCurrentSession,因为hibernate4不支持，必须使用openSession
        return sessionFactory.openSession();
    }

    @Override
    public Card getCard(int cardId) {
        return (Card)getCurrentSession().get(Card.class,cardId);
    }
}
