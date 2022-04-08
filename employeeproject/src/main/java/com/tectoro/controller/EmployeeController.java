package com.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tectoro.model.EmployeeChinni;
import com.tectoro.service.serviceInterf;

@RestController
public class EmployeeController 
{
	@Autowired 
	private serviceInterf serviceInterf;
	
	@PostMapping("/save")
	public EmployeeChinni saveEmployeeChinni(@RequestBody EmployeeChinni chinni) {
		
		return serviceInterf.saveEmployeeChinni(chinni);
	}
	@DeleteMapping("/deleByName/{name}")
	public String dele(@PathVariable  String name)
	{
		serviceInterf.deleteByNmae(name);
		return null;
		
	}
	@PutMapping("/update/{id}/{salary})")
	public EmployeeChinni saveEmployeeChinni1(@PathVariable("id") int id, @PathVariable("salary") long salary) 
	{
		return serviceInterf.saveEmployeeChinni1(id,salary);
		
	}
	
	@GetMapping("/get/{salary}")
	public List<EmployeeChinni> getAllEmp(@PathVariable long salary){
		return serviceInterf.getAllEmp(salary);
	}
	@GetMapping("/saveget/{experience}")
	public List<EmployeeChinni> getList(@PathVariable int experience)
	{
		return serviceInterf.getList(experience);
		
	}
}
