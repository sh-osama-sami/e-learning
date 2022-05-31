package gateways;



import messages.Message;


public class EmailGateway implements Gateway {
	
	public void sendMessage(Message message, String user,String[] content) {
		content[2]=user;
		message.prepareMessage(content);
		
	}
}
