package com.employee.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.demo.EmployeeRepo;
import com.employee.demo.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home(@ModelAttribute("empDto") Employee emp){
		return "home";
	}
	
	@RequestMapping("/employeeform")
	public String empForm(@ModelAttribute("empDto") Employee emp) {
		return "employee-form";
	}
	
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmp(@RequestParam Long id) {
		
	 ModelAndView mv=new ModelAndView("show-employee");
	 Employee employee=repo.findById(id).orElse(new Employee());	
	 mv.addObject(employee);
	 
	 System.out.println(repo.findByName("Sonali"));
	 return mv;	
	
	}
	
	
	@RequestMapping("/addEmployee")
	public String successPage(@Valid@ModelAttribute("empDto") Employee emp,BindingResult br) {
		if(br.hasErrors())
		{
			System.out.println("error");
			return "employee-form";
		}else
		{
			repo.save(emp);
		    return"success";
		}
		}
	

}
