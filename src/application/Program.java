package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
	}

}
