package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.Message;
import Messages.TaskAddedEmailMessage;

public class EmailGateway implements Gateway {
	
	public void sendMessage(Message message, String user,String content[]) {
		message.prepareMessage(content);
		
	}
}
