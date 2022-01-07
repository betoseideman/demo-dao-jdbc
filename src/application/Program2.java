package application;

import db.DB;
import model.dao.DaoFactoy;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactoy.createDepartmentDao();
		
		Department dep = new Department(null, "Food");
		departmentDao.insert(dep);
		System.out.println("\n ==== TEST INSERT DEPARTMENT =====");
		System.out.println("Departmente insered, id: " + dep.getId());
		
		System.out.println("\n ==== TEST find by id DEPARTMENT =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n ==== TEST update DEPARTMENT =====");
		department = departmentDao.findById(7);
		department.setName("Beer");
		departmentDao.update(department);

	}

}
