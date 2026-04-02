package model_dao;

import java.util.List;

import model_entities.Department;

public interface DepartmentDao {
	
	void insert(Department dep);
	void update(Department dep);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
