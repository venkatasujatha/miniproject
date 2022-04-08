package com.tectoro.service;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.model.EmployeeChinni;

public interface serviceInterf 
{
	//post
	public EmployeeChinni saveEmployeeChinni(EmployeeChinni chinni);
	//delete
	public void deleteByNmae(String name);

	//put
	EmployeeChinni saveEmployeeChinni1(int id,long salary);
	
	//salary
	public List<EmployeeChinni> getAllEmp(long salary);
	//experience
	List<EmployeeChinni> getList(int experience);
	
	
}
