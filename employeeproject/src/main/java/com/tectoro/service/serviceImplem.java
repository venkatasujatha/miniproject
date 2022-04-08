package com.tectoro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.dao.EmployeeRepository;
import com.tectoro.model.EmployeeChinni;
@Service
public class serviceImplem implements serviceInterf 
{
	@Autowired
	EmployeeRepository empreposite;
	@Override
	public EmployeeChinni saveEmployeeChinni(EmployeeChinni chinni) {
		
		return empreposite.save(chinni);
	}
	@Override
	public void deleteByNmae(String name) {
		empreposite.deleteByName(name);
		
	}
	
	@Override
	public List<EmployeeChinni> getAllEmp(long salary) {
	
	List<EmployeeChinni> list=new ArrayList<EmployeeChinni>();
	List<EmployeeChinni> l =list.stream().filter(i->i.getSalary()>500000).collect(Collectors.toList());
	return l;
	}
	
	
	@Override
	public EmployeeChinni saveEmployeeChinni1(int id,long salary) {
		List<EmployeeChinni> chinni=empreposite.findAll();
		for(EmployeeChinni chinni2:chinni) {
			System.out.println(chinni2.getSalary());
		}
	
	
		
		return empreposite.getById(id);
	}
	@Override
	public List<EmployeeChinni> getList(int experience) 
	{
		List<EmployeeChinni> list1=new ArrayList<EmployeeChinni>();
		List<EmployeeChinni> l1=list1.stream().filter(i->i.getExperience()>experience).collect(Collectors.toList());
		return l1;
	}
	
	
	
}
