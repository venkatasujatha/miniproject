package com.tectoro.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.tectoro.model.EmployeeChinni;
@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<EmployeeChinni, Integer>
{
	@Query(value = "delete from emp where first_name =?", nativeQuery = true)
	public void deleteByName(String name);
	

}
