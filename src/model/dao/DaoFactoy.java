package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactoy {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
