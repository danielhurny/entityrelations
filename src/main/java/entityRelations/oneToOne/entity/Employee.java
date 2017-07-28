package entityRelations.oneToOne.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import ch.qos.logback.core.net.SyslogOutputStream;
import entityRelations.Person;

@Entity
public class Employee extends Person implements Serializable{
	
	@Column(name = "salary")
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL ,fetch= FetchType.EAGER)
	@JoinColumn(name = "address")
	private Address address;

//	public Employee(int salary) {
//		super();
//		this.salary = salary;
//	}

	public Employee() {
		super();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meno"+this.getName()+"adresa"+this.getAddress().toString();
	}
	
	

}
