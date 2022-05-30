package Factory;


import Messages.DailyNewsMobileMessage;

import Messages.GradesAnnouncementMobileMessage;
import Messages.Message;

import Messages.TaskAddedMobileMessage;

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
