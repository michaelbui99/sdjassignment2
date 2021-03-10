package server.model;

import server.network.ServerSocketHandler;
import shared.Message;
import shared.PropertyChangeSubject;

import java.util.List;

public interface ChatModel extends PropertyChangeSubject
{
  void  sendMessage(Message msg);
  List<String> getConnectedUsers();
  List <Message> getMessages();
  int getNumberOfConnectedUsers();
  void addHandler(ServerSocketHandler handler);
  void removeHandler(ServerSocketHandler handler);


}
