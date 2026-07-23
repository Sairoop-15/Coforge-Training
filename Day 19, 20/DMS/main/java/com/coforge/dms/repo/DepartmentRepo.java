package com.coforge.dms.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.dms.model.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {
	public Optional<Department> findByDeptNo(int deptNo);
	public int deleteByDeptNo(int deptNo);
	public Optional<Department> findByDeptName(String deptName);
	public int deleteByDeptName(String deptName);
	
	@Query("SELECT d.deptNo FROM Department d")
	public List<Integer> getAllDepartmentIds();
}
