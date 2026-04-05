package application;

import model_dao.DaoFactory;
import model_dao.DepartmentDao;
import model_entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		// Teste 1 metodo insert
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = new Department(null, "Games");
		departmentDao.insert(dep);
		System.out.println("Adicionado novo departamento: ID: " + dep.getId()
							+ "\nNome: " + dep.getName());
	}

}
