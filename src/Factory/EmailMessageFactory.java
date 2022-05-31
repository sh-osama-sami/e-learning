package factory;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.Message;
import messages.TaskAddedEmailMessage;

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
