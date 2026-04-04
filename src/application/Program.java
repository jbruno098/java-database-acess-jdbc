package application;

import java.util.Date;
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
		
		System.out.println("\n>>>>>>TEST4: seller insert<<<<<<");
		Seller newSeller = new Seller(null, "Fulano", "fulano@gmail.com", new Date(), 1000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Novo vendedor adicionado! ID: " + newSeller.getId());
		
		
		System.out.println("\n>>>>>>TEST5: seller update<<<<<<");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Dados atualizados");

	}
}
