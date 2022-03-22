package ibmtal.trendyol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyAccounts")
public class MyAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;  
    @Column(name="surname")
    private String surname;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private String age;
    @Column(name="gender")
    private String gender;
	public MyAccount() {
		super();
	}
	public MyAccount(int id, String name, String surname, String email, String age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	
	}
	public void setMyAccounttype(String string) {
		// TODO Auto-generated method stub
		
	}
}