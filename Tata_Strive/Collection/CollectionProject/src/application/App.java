package application;

import application.DAO.EmployeeUtil;
import application.DAO.EmployeeUtilImp;
import application.model.Employee;

public class App {

	public static void main(String[] args) {
		EmployeeUtil employeeUtil = new EmployeeUtilImp();
		
		int saveEmployeeRec = employeeUtil.saveEmployeeRec(new Employee(1001, "abhi", "Developer", "IT", 30000));
		System.out.println(saveEmployeeRec);
		int saveEmployeeRec1 = employeeUtil.saveEmployeeRec(new Employee(1002, "ramesh", "Developer", "IT", 30000));
		System.out.println(saveEmployeeRec1);
		employeeUtil.showAllRec();
		
		Employee searchById = employeeUtil.searchById(1001);
		System.out.println(searchById);
		
		String deleteById = employeeUtil.deleteById(1005);
		System.out.println(deleteById);
		
		employeeUtil.showAllRec();
	}

}
