package employeemanagement;

import javax.xml.ws.Endpoint;

import employeemanagement.domain.EmployeeServiceImpl;

public class App {
	
	public static void main(String[] args){
		
		/*
		 * WSDL will be available at: http://localhost:8080/requestEmployee?wsdl
		 * Schema will be available at: http://localhost:8080/requestEmployee?xsd=1
		 * 
		 * This app needs to be running in order to JaxWsClientExample to consume this WebService
		 */
		
		Endpoint.publish("http://localhost:8080/requestEmployee", new EmployeeServiceImpl());
	}
}
