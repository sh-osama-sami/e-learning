package Gateways;

import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.Message;
import Messages.TaskAddedMobileMessage;

public class SMSGateway {
	
	public void sendMessage(Message message, String user,String content[]) {
		message.prepareMessage(content);
		
	}
}
