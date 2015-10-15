package employeeClient;

import employeemanagement.domain.Employee;
import employeemanagement.domain.EmployeeServiceImpl;
import employeemanagement.domain.EmployeeServiceImplService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * To create this project just use external tools configuration:
		 * 			name: wsimport
		 * 			location: <location of wsimport.exe in bin library of jdk>
		 * 			working directory: project´s directory on your computer´s workspace
		 * 			arguments: -keep -verbose -s ./src/ -d ./bin/ <url of wsdl from producer webservice> i.e. http://localhost:8080/requestEmployee?wsdl
		 * 
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
