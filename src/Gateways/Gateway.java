package gateways;

import messages.Message;

public interface Gateway {
    public void sendMessage(Message message, String user,String[] content);
}
