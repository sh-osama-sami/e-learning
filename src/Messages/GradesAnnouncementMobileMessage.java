package messages;

public class GradesAnnouncementMobileMessage extends SmsMessage{

	
	
	@Override
	public String prepareMessage(String[] content) {
			// code to replace place holders of this type
		return " task "+content[0]+"grade is "+content[1];
	}
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		//TODO
		return false;
	}
	
	
}
