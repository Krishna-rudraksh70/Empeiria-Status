package application.DAO;

import application.model.Employee;

public interface EmployeeUtil {
	int saveEmployeeRec(Employee emp);
	
	void showAllRec();
	
	Employee searchById(int id);
	
	String deleteById(int id);
}
