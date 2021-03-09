package client.core;

import client.network.Client;

public class ModelFactory {

    private ChatModel chatModel;
    private ClientFactory clientFactory = new ClientFactory();

    public ModelFactory(Client client)
    {

    }

    public ChatModel getChatModel()
    {
        if (chatModel == null)
        {
            chatModel = new ChatModel(clientFactory.getClient());
        }
        return chatModel;
    }
}
