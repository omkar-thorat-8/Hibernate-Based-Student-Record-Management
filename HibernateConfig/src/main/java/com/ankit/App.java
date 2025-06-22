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
		Student student = new Student(101,"Ankit",22,"Male","8177859080");
    	
    	Student student1 =  new Student(102,"Aishwarya",20,"Female","9665085160");
    	
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
