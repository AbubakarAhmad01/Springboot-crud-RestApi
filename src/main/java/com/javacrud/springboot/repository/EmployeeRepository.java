package com.javacrud.springboot.repository;

import com.javacrud.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    //all crud database methods

}
