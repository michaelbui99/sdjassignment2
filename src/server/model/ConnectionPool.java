package server.model;

import server.network.ServerSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool
{
  private List<ServerSocketHandler> connections;

  public ConnectionPool()
  {
    connections = new ArrayList<>();
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

//  public void broadcastMessage(String message)
//  {
//    System.out.println("Broadcasting: " + message + " to " + connections.size() + " clients");
//    for (ServerSocketHandler handler : connections)
//    {
//      handler.sendMessage(message);
//    }
//  }
}
