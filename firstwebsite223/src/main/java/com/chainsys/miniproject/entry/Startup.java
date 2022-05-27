package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentsUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
      try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			loadEmployeeMenu();
			break;
		case 2:
			loadDoctorMenu();
			break;
		case 3:
			loadAppointmentMenu();
			break;
		}
      }finally {
    	  sc.close();
      }
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee , 4=updateEmployeeSalary, 5=deleteEmployee, 6=getAllEmployeeDetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		
		switch (call) {
		case 1:
			EmployeeUi.addNewEmployee();
			break;
		case 2:
			EmployeeUi.viewEmployeeDetails();
			break;
		case 3:
			EmployeeUi.updateEmpDetails();
			break;
		case 4:
			EmployeeUi.updateEmployeeSalary();
			break;
		case 5:
			EmployeeUi.deleteEmpdetails();
			break;
		case 6:
			EmployeeUi.ViewAllEmployeeDetails();
			break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=updateDoctor , 4=getAllDoctorDetails, 5=deleteDoctor ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			DoctorUi.addNewDoctor();
			break;
		case 2:
			DoctorUi.viewDoctorDetails();
			break;
		case 3:
			DoctorUi.updateDocDetails();
			break;
		case 4:
			DoctorUi.ViewAllDoctorDetails();
			break;
		case 5:
			DoctorUi.deleteDoctordetails();
			break;
		}
		}finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=addNewAppointment ,2=getPatientById ,3=updateAppointment  ,4=getAllAppointmentDetails ,5=deleteAppointment");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			AppointmentsUi.addNewAppointments();
			break;
		case 2:
			AppointmentsUi.getPatientById();
			break;
		case 3:
			AppointmentsUi.updateAppDetails();
			break;
		case 4:
			AppointmentsUi.ViewAllAppointmentDetails();
			break;
		case 5:
			AppointmentsUi.deleteAppointmentDetails();
			break;
		}
		}finally {
			sc.close();
		}
	}

}
