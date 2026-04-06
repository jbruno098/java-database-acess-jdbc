package application;

import java.util.List;

import model_dao.DaoFactory;
import model_dao.DepartmentDao;
import model_entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		// Teste metodo findById
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		Department dep = departmentDao.findById(1);

		if (dep != null) {
		    System.out.println("Departamento encontrado:");
		    System.out.println("ID: " + dep.getId());
		    System.out.println("Nome: " + dep.getName());
		}
		else {
		    System.out.println("Departamento não encontrado.");
		}
		
		// teste FindAll

		List<Department> list = departmentDao.findAll();

		for (Department depart : list) {
		    System.out.println(depart);
		}
	}
} 
