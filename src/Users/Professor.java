package users;

import java.sql.Date;

public class Professor extends User {
	String department;
	Date hirringDate;
	String phdTopic;

	
	public Professor(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super(name, email, phoneNumber);
		this.department = department;
		this.hirringDate = hirringDate;
		phdTopic = phDTopic;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return phdTopic;
	}
	public void setPhDTopic(String phDTopic) {
		phdTopic = phDTopic;
	}
	
	
	public void updateMe(String message) {
		// do some stuff
		
	}
	
	
	
}
