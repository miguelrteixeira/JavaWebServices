package employeeClient;

import employeemanagement.domain.Employee;
import employeemanagement.domain.EmployeeServiceImpl;
import employeemanagement.domain.EmployeeServiceImplService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * This app will call the JaxWsServerExample WebService
		 * Url: http://localhost:8080/requestEmployee?wsdl
		 * 
		 * JaxWsServerExamples needs to be running in order to this app consumes WebServices
		 */
		
		EmployeeServiceImpl webService = new EmployeeServiceImplService().getEmployeeServiceImplPort();
		
		Employee employee = webService.getEmployeeById("1");
		
		System.out.println(employee.getName());
	}

}
