package com.springxml.application;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springxml.dao.TRAI;
import com.springxml.model.Airtel;

public class App 
{
    public static void main( String[] args )
    {
        // resource leak
        // ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // TRAI t = (TRAI) ac.getBean("j");
        // t.getSIM();

        try (ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            TRAI tj = (TRAI) ac.getBean("j");
            TRAI ta = (TRAI) ac.getBean(Airtel.class);
            
            tj.getSIM();
            ta.getSIM();

        }

    }
}
