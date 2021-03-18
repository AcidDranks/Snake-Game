package Snake;

public class Network {
    private int portNumber;
    private Client[] clients = new Client[2];
    private GameManager game = new GameManager();
    private boolean isHost = false;

    //methods
    public void disconnect()
    {

    }

    public void joinClient()
    {

    }

    public Client[] getClients() {
        return clients;
    }
}
