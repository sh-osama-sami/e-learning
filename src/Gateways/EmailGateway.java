package gateways;



import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.Message;
import messages.TaskAddedEmailMessage;


public class EmailGateway implements Gateway {
	
	public void sendMessage(Message message, String user,String[] content) {
		content[2]=user;
		message.prepareMessage(content);
		
	}

	@Override
	public Message createMessage(String type) {
		if(type.equals("task")){
			return new TaskAddedEmailMessage();
		}
		else if(type.equals("grade")){
			return new GradesAnnouncementEmailMessage();
		}
		else if(type.equals("news")){
			return new DailyNewsEmailMessage();
		}else return null;
		
	}
}
