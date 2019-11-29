package com.ptg.restapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// scanBasePackageClasses is optional if you have other base packages
@SpringBootApplication(scanBasePackageClasses= {Application.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
