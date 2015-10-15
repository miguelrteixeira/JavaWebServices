package employeemanagement.domain;

import javax.jws.WebService;

import employeemanagement.services.EmployeeService;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return new Employee("1", "Miguel Teixeira");
	}

}
