package client.view.chatroom;

import client.model.ChatModel;
import shared.Message;
import shared.PropertyChangeSubject;

import java.util.ArrayList;

public class ChatRoomVM
{
  private ChatModel model;
  private ArrayList<Message> messages;

  public ChatRoomVM(ChatModel model)
  {
    this.model = model;
    ((PropertyChangeSubject) model).addPropertyChangeListener((evt)->{
    messages.add((Message) evt.getNewValue());
    });
  }

  public void sendMessage(String msg)
  {
    model.sendMessage(msg);
  }
}
