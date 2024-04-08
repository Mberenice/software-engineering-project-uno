package ClientCommunication;

public class GameSessionControl {
    private Client client;
    private String lobbyId;

    // Constructor
    public GameSessionControl(Client client, String lobbyId) {
        this.client = client;
        this.lobbyId = lobbyId;
    }

    // Method to update the game state for this session
    public void updateGameState() {
        Object gameStateUpdate = client.receiveGameState();  // Simulating receiving a game state
        System.out.println("Game state updated for lobby " + lobbyId + ": " + gameStateUpdate);
    }

//dd
}
