package gateways;


import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncementMobileMessage;
import messages.Message;
import messages.TaskAddedMobileMessage;


public class SMSGateway implements Gateway{
	
	public void sendMessage(Message message, String user,String[] content) {
		content[2]=user;
		message.prepareMessage(content);
		
	}

	@Override
	public Message createMessage(String type) {
		if(type.equals("task")){
			return new TaskAddedMobileMessage();
		}
		else if(type.equals("grade")){
			return new GradesAnnouncementMobileMessage();
		}
		else if(type.equals("news")){
			return new DailyNewsMobileMessage();
		}else return null;
		
		
	}
}
