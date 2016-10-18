/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Yogesh
 */
public class storedata {
     public static void main(String[] args){
    Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
applySettings(cfg.getProperties());
SessionFactory sf = cfg.buildSessionFactory(builder.build());

    
    
        Session s=sf.openSession();
        
        Transaction t=s.beginTransaction();
        employee e1= new employee();
        e1.setName("K");
        regularemploy e2= new regularemploy();
        e2.setName("Vijay Kumar");
        e2.setSalary(50000);
        e2.setBonus(5);
        
        contractemploy e3= new contractemploy();
        e3.setName("YoYo Kumar");
        e3.setPayperhour(1000);
        e3.setContractduration("15 hours");
        
        s.persist(e1);
        s.persist(e2);
        s.persist(e3);
        t.commit();
        s.close();
        System.out.println("success");
}
}
