package entityRelations.oneToOne.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entityRelations.oneToOne.DAO.AddressRepository;
import entityRelations.oneToOne.DAO.EmployeeRepository;
import entityRelations.oneToOne.entity.Address;
import entityRelations.oneToOne.entity.Employee;

@Component
public class ServiceJPA {
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Autowired
	AddressRepository addressRepo;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
		
	}
	
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}
	public Employee findOne(String name) {
		return employeeRepo.findByName(name);
	}

	public Employee findByAddress(int i) {
		return employeeRepo.findByAddressId(i);
	}
}
