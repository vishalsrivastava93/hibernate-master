package com.example.HibernateExample.Main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Starter {
	@Autowired
	public static SessionFactory sessionFactory;
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
		sessionFactory=new Configuration().configure().buildSessionFactory();

	}

}
