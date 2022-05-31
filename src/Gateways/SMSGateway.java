package gateways;


import messages.Message;


public class SMSGateway {
	
	public void sendMessage(Message message, String user,String[] content) {
		content[2]=user;
		message.prepareMessage(content);
		
	}
}
