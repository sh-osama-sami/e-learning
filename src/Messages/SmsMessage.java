package Messages;

public abstract class SmsMessage implements Message {
    public abstract String prepareMessage(String content[]) ;
}
