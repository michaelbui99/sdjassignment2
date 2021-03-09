package client.view.usernamewindow;

import client.model.ChatModel;


public class UserNameVM
{

  private ChatModel model;

  public UserNameVM(ChatModel model)
  {
    this.model = model;

  }

  public void addUser(String name)
  {
    model.setUserName(name);
  }

}
