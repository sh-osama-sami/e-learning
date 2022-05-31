package factory;

import messages.Message;

public interface Factory {
    public Message createDaily() ;
    
    public Message createTask() ;

    
    public Message createGrade() ;
}
