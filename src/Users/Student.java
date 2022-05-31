package users;

public class Student extends User {
	int id;
	
	public Student(String name, int id, String email, String phoneNumber) {
		super(name, email, phoneNumber);	
		this.id = id;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void updateMe(String message) {
		// do some stuff
	}
	
}
