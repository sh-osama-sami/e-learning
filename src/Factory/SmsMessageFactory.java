package factory;


import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncementMobileMessage;
import messages.Message;
import messages.TaskAddedMobileMessage;

public class SmsMessageFactory implements Factory   {

    
    public Message createDaily() {
       
        return new DailyNewsMobileMessage();
    }

    
    public Message createTask() {
      
        return new TaskAddedMobileMessage();
    }

    
    public Message createGrade() {
       
        return new GradesAnnouncementMobileMessage();
    }
    
}
