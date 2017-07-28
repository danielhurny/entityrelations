package entityRelations.oneToOne.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "addressid")
	private int id;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "postCode")
	private String postCode;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="address")
	private Employee employee;
	
	

	public Address() {
		super();
	}

	public Address(int id, String street, String city, String postCode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ulica"+getStreet()+" mesto "+getCity()+" id "+getId()+ " Employee name: "+getEmployee().getName() ;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
