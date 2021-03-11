package client.model;

import client.network.Client;
import client.network.ClientSocket;
import shared.Message;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ChatModelManager implements ChatModel
{
  private Client client;
  private PropertyChangeSupport support;

  public ChatModelManager(Client client)
  {
    this.client = client;
    support = new PropertyChangeSupport(this);
    client.startClient();
    client.addPropertyChangeListener("SendMessage", (evt)->support.firePropertyChange(evt));
  }

  @Override public void sendMessage(String msg)
  {
    client.sendMessage(msg);
  }

  @Override public List<String> getConnectedUsers()
  {
    return client.getConnectedUsers();
  }

  @Override public List<Message> getMessages()
  {
    return client.getMessages();
  }

  @Override public String getUserName()
  {
    return client.getUserName();
  }

  @Override public void setUserName(String name)
  {
    client.setUserName(name);
  }

  @Override public int getNumberOfConnectedUsers()
  {
    return client.getNumberOfConnectedUsers();
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(name, listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(name, listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }
}
