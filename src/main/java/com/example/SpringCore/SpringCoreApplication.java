package com.example.SpringCore;

import com.example.SpringCore.Couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		Person person = context.getBean(Person.class);
		person.PlayWithAnimal();

	}

}
