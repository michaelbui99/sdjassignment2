package server.model;

import server.network.ServerSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool
{
  private List<ServerSocketHandler> connections;
  private List<String> users;

  public ConnectionPool()
  {
    connections = new ArrayList<>();
    users = new ArrayList<>();
  }

  public void addHandler(ServerSocketHandler handler)
  {
    connections.add(handler);
  }

  public void removeHandler(ServerSocketHandler handler)
  {
    connections.remove(handler);
  }

  public int getNumberOfConnections()
  {
    return connections.size();
  }

  public List<String> getUsers()
  {
    return users;
  }

  public void addUser(String user)
  {
    users.add(user);
  }

  public void removeUser(String user)
  {
    users.remove(user);
  }

//  public void broadcastMessage(String message)
//  {
//    System.out.println("Broadcasting: " + message + " to " + connections.size() + " clients");
//    for (ServerSocketHandler handler : connections)
//    {
//      handler.sendMessage(message);
//    }
//  }
}
