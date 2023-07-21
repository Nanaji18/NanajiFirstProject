package com.demo;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Sample {
       public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
    	     
    	  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hbm.cfg.xml").build();   
    	  Metadata meta =new  MetadataSources(ssr).getMetadataBuilder().build();  
    	  SessionFactory factory = meta.getSessionFactoryBuilder().build();  
          Session session = factory.openSession();  
          Transaction t = (Transaction) session.beginTransaction();  
          
          Employee e=new Employee();
          e.setEmpno(118);
          e.setEname("nani");
          e.setSal(899);
          
          session.save(e);
          t.commit();
       
       }
}