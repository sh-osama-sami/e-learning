package Messages;

public class GradesAnnouncementEmailMessage extends EmailMessage{

	
	@Override
	public String prepareMessage(String[] content) {
		// code to replace place holders of this type
		return " task "+content[0]+"grade is "+content [1];
		
	}

	public boolean verifyGrades() {	
		// code to verify Grades before announcement
		return false;
	}
	
	
}
