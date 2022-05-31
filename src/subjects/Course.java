package subjects;
import java.util.ArrayList;

import gateways.EmailGateway;
import gateways.Gateway;
import messages.Message;
import users.User;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	ArrayList<User> userForEmailNotification;
	ArrayList<User> userForSMSNotification;
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();
		
		userForEmailNotification = new ArrayList<>();
		userForSMSNotification = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeUserForEmailNotification(User user) {
		userForEmailNotification.add(user);
	}
	
	public void subscribeUserForSMSNotification(User user) {
		userForSMSNotification.add(user);
	}

	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] assignment = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(assignment,"task");
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] assignment,String type) {
		// notify users by email
		// open connection for Email gateway and do some configurations to the object

		Gateway emailGateway = new EmailGateway();
		Message msg = emailGateway.createMessage(type);
		String notification = msg.prepareMessage(assignment);
		
		for (User subscriber : userForEmailNotification) {
			subscriber.updateMe(notification);
			emailGateway.sendMessage(msg, subscriber.getEmail(),assignment);
		}


	}
	
	
	
	
}
