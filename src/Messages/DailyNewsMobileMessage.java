package messages;

public class DailyNewsMobileMessage  extends SmsMessage {
	
	@Override
	public String prepareMessage(String[] content) {
		
		return " Latest news : "+content[0];
	}
}
