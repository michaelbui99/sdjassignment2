package client.view.chatroom;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatRoomController
{
  @FXML public TextArea chatWindow;
  @FXML public TextField messageField;
  private ViewHandler viewHandler;
  private ViewModelFactory viewModelFactory;

  public void init(ViewHandler viewHandler, ViewModelFactory vmf)
  {
    this.viewHandler = viewHandler;
    this.viewModelFactory = viewModelFactory;
  }

  @FXML public void onButtonClose(ActionEvent actionEvent)
  {
  }

  @FXML public void onButtonOpenClient(ActionEvent actionEvent)
  {
  }

  @FXML public void onButtonSend(ActionEvent actionEvent)
  {
  }

  @FXML public void onButtonConnections(ActionEvent actionEvent)
  {
  }


}
