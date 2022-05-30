package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.Message;
import Messages.TaskAddedEmailMessage;

public class EmailGateway implements Gateway {
	
	public void sendMessage(Message message, String user,String content[]) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsEmailMessage) {
			DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
			
			dailyNewsEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementEmailMessage) {
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
			
			announcementEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedEmailMessage) {
			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
			
			addedEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message by email to user
		}
		
	}
}
