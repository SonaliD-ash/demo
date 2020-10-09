package com.employee.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {

	@Id
	//@GeneratedValue
	private Long id;
	@NotBlank(message = "* Required")
	private String name;
	private String deptName;

	public Employee() {
		super();
	}

	public Employee(Long id, @NotBlank String name, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + "]";
	}

}
