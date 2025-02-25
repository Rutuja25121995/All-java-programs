package com.tech;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		Voter voter= new Voter();
		voter.setAge(27);
		voter.setName("aaaa");
		
		
		Vote vote= new Vote();
		vote.setPartyName("BJP");
		vote.setElectionDate(new Date());
		vote.setVoter(voter);

		voter.setVote(vote);
		
		session.save(vote);
		session.save(voter);
		
      		
		txn.commit();
		session.close();
	
	}
}
