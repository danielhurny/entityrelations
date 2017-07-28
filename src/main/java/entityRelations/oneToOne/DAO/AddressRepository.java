package entityRelations.oneToOne.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entityRelations.oneToOne.entity.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	Address save(Address address);
	
	


}
