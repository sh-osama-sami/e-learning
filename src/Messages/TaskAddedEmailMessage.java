package Messages;

public class TaskAddedEmailMessage extends EmailMessage {

	public String prepareMessage(String content[]) {
		// code to replace place holders of this type
		return " task is added to the content section due is "+content[0]+"type is"+content[1];
		
	}
	
	public void addTeamDescription(String desc) {
		//TODO
	}
	
}
