package com.employeemanagement.springboot;

import com.employeemanagement.springboot.model.Employee;
import com.employeemanagement.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Person1");
//		employee.setLastName("Lastname1");
//		employee.setEmailId("Person1@gmail.com");
//		employeeRepository.save(employee);

//		Employee employee2 = new Employee();
//		employee2.setFirstName("Person2");
//		employee2.setLastName("Lastname2");
//		employee2.setEmailId("Person2@gmail.com");
//		employeeRepository.save(employee2);
	}
}
