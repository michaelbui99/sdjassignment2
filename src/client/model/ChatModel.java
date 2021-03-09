package client.model;

import shared.Message;

import java.util.List;

public interface ChatModel
{
  void  sendMessage(String msg);
  List<String> getConnectedUsers();
  List <Message> getMessages();
  int getNumberOfConnectedUsers();

}
