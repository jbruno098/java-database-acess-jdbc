package application;

import model_dao.DaoFactory;
import model_dao.DepartmentDao;
import model_entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		// Teste 1 metodo insert
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = new Department(5, "Games");
		//departmentDao.insert(dep);
		System.out.println("Adicionado novo departamento: ID: " + dep.getId()
							+ "\nNome: " + dep.getName()); 
		
		// Teste 2 metodo update
		dep.setName("Tools");
		departmentDao.update(dep);
		System.out.println("Dados Atualizados! Novo Nome: " + dep.getName());
	}

}
