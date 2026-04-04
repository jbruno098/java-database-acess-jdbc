package application;

import java.util.List;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(">>>>>>TEST1: seller findByID<<<<<<");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n>>>>>>TEST2: seller findByDepartment<<<<<<");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n>>>>>>TEST3: seller findAll<<<<<<");
		list = sellerDao.findAll();
		
		for (Seller sel : list) {
			System.out.println(sel);
		}
	}
}
