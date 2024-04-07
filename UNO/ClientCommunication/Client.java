package ClientCommunication;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Client {
	  private ObjectInputStream inputStream;

	public void sendRequest(Object request)
	{
	//simulate sending request to the server
		System.out.println("Sending request to the server:" +request); 
		
	//simulate receiving response from the server
		Object response="Response from the server";
		
	//Handle the response 
	handleResponse(response);
		
	}
	private void handleResponse(Object response) {
        // Simulate handling the response
        System.out.println("Received response from the server: " + response);
    }
	
    public boolean receiveLoginResponse() {
        // Simulate receiving the response from the server
        // For the sake of simulation, let's assume login is always successful
        return true;
    }
	//trial

}
