package Snake;

public class Client extends Network{
    private Player player = new Player();
    private String username;

    //methods
    public void connect()
    {

    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername() {return username;}
}
