package application;

import java.util.Date;

import model_entities.Department;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Test");
		System.out.println(obj);
		
		Seller seller = new Seller(2, "Fulano", "fulano@gmail.com", new Date(), 1000.0, obj);
		System.out.println(seller);
	}
}
