package server;

import shared.Message;

import java.util.ArrayList;

public class MessageList
{
  private ArrayList<Message> messages;

  public MessageList()
  {
    messages = new ArrayList<>();
  }

  public void addMessage(Message msg)
  {
    messages.add(msg);
  }

  public ArrayList<Message> getAllMessages()
  {
    return messages;
  }

  public int getNumberOfMessages()
  {
    return messages.size();
  }

}
