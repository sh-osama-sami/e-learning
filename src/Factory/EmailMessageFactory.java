package Factory;

import Messages.DailyNewsEmailMessage;


import Messages.GradesAnnouncementEmailMessage;
import Messages.Message;
import Messages.TaskAddedEmailMessage;

public class EmailMessageFactory implements Factory {

    
    public Message createDaily() {
       
        return new DailyNewsEmailMessage();
    }

    
    public Message createTask() {
      
        return new TaskAddedEmailMessage();
    }

    
    public Message createGrade() {
      
        return new GradesAnnouncementEmailMessage();
    }
    
}
