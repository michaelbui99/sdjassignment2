package client.core;

public class ViewModelFactory {

    private ChatRoomViewVM chatRoomViewVM;
    private UserNameViewVM userNameViewVM;

    public ViewModelFactory(ModelFactory mf)
    {
        chatRoomViewVM = new MainViewVM();
        userNameViewVM = new ControlViewVM();
    }

    public UserNameViewVM getUserNameViewVM()
    {
        return userNameViewVM;
    }

    public ChatRoomViewVM getChatRoomViewVM()
    {
        return chatRoomViewVM;
    }
}
