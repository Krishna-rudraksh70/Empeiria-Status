package application.DAO;

import java.util.ArrayList;

import application.model.Employee;

public class EmployeeUtilImp implements EmployeeUtil{
	ArrayList<Employee> source = new ArrayList<>();
	
	@Override
	public int saveEmployeeRec(Employee emp) {
		boolean b = source.add(emp);
		return emp.getEmpid();
	}

	@Override
	public void showAllRec() {
		for(Employee emp:source) {
			System.out.println(emp);
		}
		
	}


	@Override
	public Employee searchById(int id) {
		Employee _emp = null;
		
		for(Employee emp:source) {
			if(emp.getEmpid()==id)
				_emp = emp;
		}
		return _emp;
	}

	@Override
	public String deleteById(int id) {
		Employee searchById = searchById(id);
		boolean remove = source.remove(searchById);
		return remove?"record delted with "+id:"record not found";
	}

}
