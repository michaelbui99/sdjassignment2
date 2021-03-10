package client.view.chatroom;

import client.model.ChatModel;

public class ChatRoomVM
{
  private ChatModel model;

  public ChatRoomVM(ChatModel model)
  {
    this.model = model;

  }

  public void sendMessage(String msg)
  {
    model.sendMessage(msg);
  }
}
