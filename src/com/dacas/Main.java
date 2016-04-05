package com.dacas;

import com.dacas.dao.BoundDao;
import com.dacas.dao.CardDao;
import com.dacas.dao.impl.BoundDaoImpl;
import com.dacas.data.Bound;
import com.dacas.data.Card;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by dave on 2016/4/5.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        BoundDao boundDao = context.getBean(BoundDao.class);
        Bound bound = boundDao.getBound(7);
        System.out.println(bound);

//        Bound bound1 = new Bound();
//        bound1.setPersonId(44);
//        bound1.setId(44);
//        bound1.setDeviceId(44);
//        bound1.setBoundTime(new Date());
//        bound1.setStatus(1);
//        boundDao.saveBound(bound1);
        bound.setBoundTime(new Date());
        bound.setPersonId(77);
        boundDao.update(bound);

        CardDao cardDao = context.getBean(CardDao.class);
        Card card = cardDao.getCard(20);
        System.out.println(card);
    }
}
