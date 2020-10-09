package com.employee.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	List<Employee> findByName(String name);

}
