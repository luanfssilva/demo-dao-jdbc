package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

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
		
	}

}
