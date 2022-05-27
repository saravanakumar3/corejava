package com.chainsys.miniproject.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;
public class EmployeeUi {
	
	
	public static void addNewEmployee() {
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		try {
		System.out.println("Enter the Employee id:");
		String emp_id=sc.nextLine();
		try {
			Validator.checkStringForParseInt(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.checkNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		emp.setEMPLOYEE_ID(id);
		
		
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			System.out.println("Error:"+e.getMessage());
			System.exit(-1);
		}
		emp.setFIRST_NAME(emp_Firstname);
		
		
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		emp.setLAST_NAME(emp_LastName);
		
		
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email); 
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	    emp.setEmail(emp_email);
	    
	    
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHIRE_DATE(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	    
	    
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	System.exit(-1);
	    }
	    emp.setJOB_ID(emp_Job_id);
	    
	    
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=0.0f;
	    try {
	    	emp_salary=sc.nextFloat();
			Validator.checkSalaryLimit(emp_salary);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	    emp.setSALARY(emp_salary);
	    
	    int result=EmployeeDao.insertEmployee(emp);
	    System.out.println(result+"row inserted");
	    sc.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	public static void viewEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.checkNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Employee emp=EmployeeDao.getEmployeeById(emp_id);
		System.out.println("Employee id:"+emp.getEMPLOYEE_ID());
		System.out.println("Employee First Name:"+emp.getFIRST_NAME());
		System.out.println("Employee last Name :"+emp.getLAST_NAME());
		System.out.println("Employee hired date:"+emp.getHIRE_DATE());
		System.out.println("Employee job_id:"+emp.getJOB_ID());
		System.out.println("Employee Salary:"+emp.getSALARY());
		sc.close();
	}
	public static void ViewAllEmployeeDetails() {
		List<Employee> emplist =EmployeeDao.getAllEmployee();
		Iterator<Employee> empItr=emplist.iterator();
		while(empItr.hasNext()) {
			Employee emp=empItr.next();
			System.out.println("emp id:"+emp.getEMPLOYEE_ID());
			System.out.println("Emp Name:"+emp.getFIRST_NAME());
		}
	}
	public static void updateEmpDetails() {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter the Employee id:");
		String emp_id=null;
		try {
			emp_id=sc.nextLine();
			Validator.checkStringForParseInt(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.checkNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		emp.setEMPLOYEE_ID(id);
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		emp.setFIRST_NAME(emp_Firstname);
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		emp.setLAST_NAME(emp_LastName);
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	    emp.setEmail(emp_email);
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHIRE_DATE(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	System.exit(-1);
	    }
	    emp.setJOB_ID(emp_Job_id);
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=sc.nextFloat();
	    try {
	    	Validator.checkSalaryLimit(emp_salary);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    	System.exit(-1);
	    }
	    emp.setSALARY(emp_salary);
	    int result=EmployeeDao.updateEmployee(emp);
	    System.out.println(result+"row updated");
	    sc.close();
	}
	public static void deleteEmpdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.checkNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = EmployeeDao.deleteEmployee(emp_id);
		System.out.println(result +"row deleted");
		sc.close();
	}
	public static void updateEmployeeSalary() {
        java.util.Scanner sc =new java.util.Scanner(System.in);  
        try {
        Employee newemp=new Employee();
        System.out.println("Enter Employee Id :");
       String id=sc.nextLine();
        int empId=Integer.parseInt(id);
              Employee emp= EmployeeDao.getEmployeeById(empId);
              if(emp==null) {
                  System.out.println("Employee Doesn't Exist For Id "+empId); //
                  return ;
              }
          newemp.setEMPLOYEE_ID(empId); 
          System.out.println("Enter Update salary :");
          float salary =sc.nextFloat();
          newemp.setSALARY(salary);
          int result =EmployeeDao.updateEmployeeSalary(empId,salary);
          System.out.println(result +"row inserted");
        }finally {
            sc.close();
        }
      }
	public static void updateEmployeeFirstName() {
        java.util.Scanner sc =new java.util.Scanner(System.in); 
        try {
        Employee newemp=new Employee();
        System.out.println("Enter Employee Id :");
        String id=sc.nextLine();
        int empId=Integer.parseInt(id);
              Employee emp= EmployeeDao.getEmployeeById(empId);
              if(emp==null) {
                  System.out.println("Employee Doesn't Exist For Id "+empId); //
                  return ;
              }
          newemp.setEMPLOYEE_ID(empId); 
          System.out.println("Enter Update Name :");
          String update_name= sc.nextLine();
          int result =EmployeeDao.updateEmployeeFirstName(empId,update_name);
          System.out.println(result);
        }finally {
            sc.close();
        }
      }

}
