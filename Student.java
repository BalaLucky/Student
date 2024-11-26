package sct.sra.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	private String Username;
	private String Password;
	private String Name;
	@Override
	public String toString() {
		return "Student [Username=" + Username + ", Password=" + Password + ", Name=" + Name + ", Phone=" + Phone
				+ ", Email=" + Email + "]";
	}
	public Student() {
		super();
	}
	private Long  Phone;
	private String Email;
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	} 
	public String getName() {
		return Name;
	}
	public Student(String username, String password, String name, Long phone, String email) {
		super();
		Username = username;
		Password = password;
		Name = name;
		Phone = phone;
		Email = email;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Object getUsername(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
}
	


