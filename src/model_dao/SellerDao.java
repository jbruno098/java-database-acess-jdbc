package model_dao;

import java.util.List;

import model_entities.Department;
import model_entities.Seller;

public interface SellerDao {
	
	void insert(Seller dep);
	void update(Seller dep);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department dep);
}
