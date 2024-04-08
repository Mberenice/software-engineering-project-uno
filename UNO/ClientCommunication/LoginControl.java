package ClientCommunication;

public class LoginControl {
    private Client client;
    private String username;
    private String password;

    // Constructor
    public LoginControl(Client client, String username, String password) {
        this.client = client;
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        Object loginRequest = "LOGIN:" + username + ":" + password;
        client.sendRequest(loginRequest);
        return client.receiveLoginResponse();
    }

//vdfet
}

