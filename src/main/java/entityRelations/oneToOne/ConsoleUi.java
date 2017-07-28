package entityRelations.oneToOne;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import entityRelations.oneToOne.entity.Address;
import entityRelations.oneToOne.entity.Employee;
import entityRelations.oneToOne.service.ServiceJPA;

@Component
public class ConsoleUi {
	
	@Autowired
    ServiceJPA serviceJPA;

	public void play() {
		
		
		
		
		
		Address address1 = new Address();
		address1.setCity("barcelona");
		address1.setPostCode("04011");
		address1.setStreet("Main");
//		address1.setEmployee(employee);

		Employee employee = new Employee();
		employee.setAge(22);
		employee.setBirthDate(new Date());
		employee.setName("Esteban");
		employee.setSalary(1550);
		employee.setAddress(address1);
		
//		serviceJPA.saveAddress(address1);
//		System.out.println("add saved");
		serviceJPA.saveEmployee(employee);
		System.out.println("empl saved");
		
		List<Employee> entities = serviceJPA.getEmployee();
		
		for(Employee entity:entities){
			System.out.println(entity.getAddress().toString());
			System.out.println(entity.getName());
			System.out.println(entity.getAddress().getStreet());
			System.out.println(entity.toString());
		}
		
		
	}
}
