package client.model;

import shared.Message;
import shared.PropertyChangeSubject;

import java.io.IOException;
import java.util.List;

public interface ChatModel extends PropertyChangeSubject
{
  void  sendMessage(String msg);
  List<String> getConnectedUsers();
  List <Message> getMessages();
  String getUserName();
  void setUserName(String name, String oldName) throws IOException, ClassNotFoundException;
  int getNumberOfConnectedUsers();

}
