package client.network;

import shared.Message;
import shared.PropertyChangeSubject;

import java.util.List;

public interface Client extends PropertyChangeSubject
{
   void startClient();
   void  sendMessage(String msg);
   List <String> getConnectedUsers();
   List <Message> getMessages();
   String getUserName();
   void setUserName(String name);
   int getNumberOfConnectedUsers();

}
