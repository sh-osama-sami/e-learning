package messages;

public class GradesAnnouncementMobileMessage extends GradesAnnouncement {

	
	
	@Override
	public String prepareMessage(String[] content) {
			// code to replace place holders of this type
		return " task "+content[0]+"grade is "+content[1];
	}
	
	
	
}
