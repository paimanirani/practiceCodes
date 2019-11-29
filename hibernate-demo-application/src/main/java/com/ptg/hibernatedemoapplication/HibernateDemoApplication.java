package com.ptg.hibernatedemoapplication;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ptg.hibernatedemoapplication.dao.StudentDAOImpl;
import com.ptg.hibernatedemoapplication.entity.Student;

@SpringBootApplication
public class HibernateDemoApplication implements CommandLineRunner {

	private StudentDAOImpl studentDAOImpl;

	@Autowired
	public HibernateDemoApplication(StudentDAOImpl studentDAOImpl) {
		this.studentDAOImpl = studentDAOImpl;
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		System.out.println(studentDAOImpl.findAll());

		System.out.println(studentDAOImpl
				.save(new Student("Chris", "Ronaldo", "ronaldo@gmail.com", DateUtils.parseDate("25/10/1983"))));

	}

}
