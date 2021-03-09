package client.view.clinetswindow;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ClientsController
{
  private ViewHandler viewHandler;
  private ViewModelFactory viewModelFactory;

  public void init(ViewHandler viewHandler, ViewModelFactory vmf)
  {
    this.viewHandler = viewHandler;
    this.viewModelFactory = vmf;
  }
  @FXML public TextArea usersAria;

  @FXML public void onButtonClose(ActionEvent actionEvent)
  {
  }


}
