package entityRelations.oneToOne.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entityRelations.oneToOne.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee save(Employee employee);
	
	Employee findByName(String name);
	
	Employee findByAddressId(int id);

}
