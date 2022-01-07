package application;

import java.util.List;

import model.dao.DaoFactoy;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactoy.createDepartmentDao();
		/*
		Department dep = new Department(null, "Food");
		departmentDao.insert(dep);
		System.out.println("\n ==== TEST INSERT DEPARTMENT =====");
		System.out.println("Departmente insered, id: " + dep.getId()); */
		
		System.out.println("\n ==== TEST find by id DEPARTMENT =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n ==== TEST update DEPARTMENT =====");
		department = departmentDao.findById(8);
		department.setName("D1");
		departmentDao.update(department);
		System.out.println(department);
		
		System.out.println("\n ==== TEST FIND ALL DEPARTMENT =====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

	}

}
