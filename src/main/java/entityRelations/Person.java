package entityRelations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public abstract class Person {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name= "name", unique = true)
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "contractDate")
	private Date contractDate;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return contractDate;
	}

	public void setBirthDate(Date birthDate) {
		this.contractDate = birthDate;
	}
	
	

}
