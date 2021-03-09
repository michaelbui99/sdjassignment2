package client.core;

import client.network.Client;

public class ModelFactory {

    private ChatModel chatModel;

    public ModelFactory(Client client)
    {

    }

    public ChatModel getChatModel()
    {
        if (chatModel == null)
        {
            chatModel = new ChatModel();
        }
        return chatModel;
    }
}
