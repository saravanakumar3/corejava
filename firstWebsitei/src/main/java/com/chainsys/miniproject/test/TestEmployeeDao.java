package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
	public static void testGetAllEmployee() {
		List<Employee> allEmployee = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployee.iterator();
		while(empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp.getEMPLOYEE_ID()+" "+emp.getFIRST_NAME()+" "+emp.getSALARY());
		}
	}
	public static void testGetEmployeeById() {
		Employee emp = EmployeeDao.getEmployeeById(100);
		System.out.println(emp.getEMPLOYEE_ID()+" "+emp.getFIRST_NAME()+" "+emp.getSALARY());
	}
	public static void testInsertEmployee()
    {
        Employee newemp=new Employee();
        newemp.setEMPLOYEE_ID(300);
        newemp.setFIRST_NAME("Ayyanar");
        newemp.setLAST_NAME("A");
        newemp.setEmail("ayyanar@chainsys.com");
        Calendar c1=Calendar.getInstance();
        java.util.Date newDate=c1.getTime();
        newemp.setHIRE_DATE(newDate);
        newemp.setJOB_ID("IT_PROG");
        newemp.setSALARY(24000);
        int result=EmployeeDao.insertEmployee(newemp);
        System.out.println(result);
    }
	public static void testUpdateEmployee() {
		Employee oldemp = EmployeeDao.getEmployeeById(25);
		System.out.println(oldemp.getEMPLOYEE_ID()+" "+oldemp.getFIRST_NAME()+oldemp.getSALARY()); 
		oldemp.setEMPLOYEE_ID(20);
	    oldemp.setFIRST_NAME("Ayyanar");
		oldemp.setLAST_NAME("A");
		oldemp.setEmail("ayyanar.arumugasamy@chainsys.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldemp.setHIRE_DATE(newDate);
		oldemp.setJOB_ID("IT27008");
		oldemp.setSALARY(15000);
		int result = EmployeeDao.insertEmployee(oldemp);
		System.out.println(result);
	}
}
