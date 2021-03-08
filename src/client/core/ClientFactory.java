package client.core;

public class ClientFactory {

    private Client client;

    public Client getClient()
    {
        if (client == null)
        {
            client = new Client();
        }
        return client;
    }
}
