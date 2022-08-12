package org.genspark.martintorrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkAssignment1Application.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student1 = (Student) context.getBean("Student");
		System.out.println(student1);
		
		
		
		((AbstractApplicationContext) context).close();
	}

}
