package client.view.usernamewindow;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UserNameController
{
 private ViewHandler viewHandler;
 private UserNameVM userNameVM;

 @FXML public TextField userName;

 public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
 {
  this.viewHandler = viewHandler;
  this.userNameVM = viewModelFactory.getUserNameViewVM();
 }

  @FXML public void onButtonBack(ActionEvent actionEvent) throws IOException
  {
   viewHandler.openView("ChatRoom");
  }

  @FXML public void onButtonSave(ActionEvent actionEvent)
  {
  userNameVM.addUser(userName.getText());
  }
}
