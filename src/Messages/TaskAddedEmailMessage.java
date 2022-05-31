package messages;

public class TaskAddedEmailMessage extends TaskAdded {

	public String prepareMessage(String[] content) {
		// code to replace place holders of this type
		return " task is added to the content section due is "+content[0]+"type is"+content[1];
		
	}
	
	
	
}
