package com.ankit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

    	@SuppressWarnings("unused")
		Student student = new Student("Ankit",22,"Male","0000000000");
    	
    	Student student1 =  new Student("Aishwarya",20,"Female","11111111111");
    	
    	Configuration configuration =new Configuration();
    	
    	configuration.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory =configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	session.save(student1);
    	
    	transaction.commit();
    	
    	session.close();
    	
    	System.out.println("Record Saved SuccessFully");
    }
}
