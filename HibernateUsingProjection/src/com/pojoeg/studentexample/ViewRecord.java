package com.pojoeg.studentexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ViewRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf= cfg.buildSessionFactory();
			Session s = sf.openSession();
			Criteria ct = s.createCriteria(Stuexample.class);
		        ct.setProjection(Projections.property("sname"));
		        List lst = ct.list();
			Iterator it = lst.iterator();
			while(it.hasNext())
			{
				Object o = it.next();
			        System.out.println(o);
				
			}
			s.close();
			sf.close();
	}

}
