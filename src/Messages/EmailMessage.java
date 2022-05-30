package Messages;

public abstract class EmailMessage implements Message{
    public abstract  String prepareMessage(String content[]);

}
