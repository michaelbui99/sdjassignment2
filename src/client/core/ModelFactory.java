package client.core;

public class ModelFactory {

    private ChatModel chatModel;

    public ChatModel getChatModel()
    {
        if (chatModel == null)
        {
            chatModel = new ChatModel();
        }
        return chatModel;
    }
}
