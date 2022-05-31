package messages;

public class DailyNewsEmailMessage implements Message  {
	

	@Override
	public String prepareMessage(String[] content) {
		// code to replace place holders of this type
		return " Latest news : "+content[0];
	}
}
