package messages;

public class DailyNewsMobileMessage implements Message  {
	
	@Override
	public String prepareMessage(String[] content) {
		
		return " Latest news : "+content[0];
	}
}
