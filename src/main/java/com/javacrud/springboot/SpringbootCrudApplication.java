package com.javacrud.springboot;

import com.javacrud.springboot.model.Employee;
import com.javacrud.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Abubakar");
		employee.setLastName("Shah");
		employee.setEmailId("Abubakarshah@gmail.com");
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstName("Zaid");
		employee1.setLastName("Shah");
		employee1.setEmailId("Zaidshah@gmail.com");
		employeeRepository.save(employee1);

	}
}
