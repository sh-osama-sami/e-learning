import java.util.ArrayList;

import Factory.EmailMessageFactory;
import Factory.Factory;
import Gateways.EmailGateway;
import Gateways.Gateway;
import Messages.Message;
import Users.User;

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
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		
		userForEmailNotification = new ArrayList<User>();
		userForSMSNotification = new ArrayList<User>();
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

	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] Assignment = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(Assignment);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] Assignment) {
		// notify users by email

		Factory emailMessageFactory = new EmailMessageFactory();
		Message msg = emailMessageFactory.createTask();
		String notification = msg.prepareMessage(Assignment);

		// open connection for Email gateway and do some configurations to the object

		Gateway emailGateway = new EmailGateway();
		
		for (User subscriber : userForEmailNotification) {
			subscriber.updateMe(notification);
			emailGateway.sendMessage(msg, subscriber.getEmail(),Assignment);
		}


	}
	
	
	
	
}
