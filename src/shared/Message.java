package shared;

import java.util.Date;

public class Message
{
  private String message;
  private String userName;
  private Date time;

  public Message(String message, String userName)
  {
    this.message = message;
    this.userName = userName;
    time =new Date();
  }

  public String getMessage()
  {
    return message;
  }

  public String getUserName()
  {
    return userName;
  }

  public Date getTime()
  {
    return time;
  }
}
