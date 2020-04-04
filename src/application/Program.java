package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("====== TEST 1: findById ========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("====== TEST 2: findByDepartment ========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller objSeller : list) {
			System.out.println(objSeller);
		}
		
		System.out.println("====== TEST 3: findAll========");
		list = sellerDao.findAll();
		for(Seller objSeller : list) {
			System.out.println(objSeller);
		}	
		
		
		System.out.println("====== TEST 4: insert ========");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId()); 
		
		System.out.println("====== TEST 5: update ========");
		seller = sellerDao.findById(7);
		seller.setName("Bruce Wayne");
		seller.setEmail("batman@gmail.com");
		seller.setBaseSalary(10000.00);
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("====== TEST 6: delete ========");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
			
	}

}
