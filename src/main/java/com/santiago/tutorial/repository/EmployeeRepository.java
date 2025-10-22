package com.santiago.tutorial.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.santiago.tutorial.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
