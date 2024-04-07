package ClientCommunication;

public class StartUpControl {

private Client client;

public StartUpControl(Client client) {
    this.client = client;
}

//function to create a login request
public boolean login(String username, String password)
{
	// Create a login request
	LoginControl loginControl = new LoginControl(username, password);
	 
	//send the create account request to the Server
	 client.sendRequest(loginControl);
	 
	 // Receive and process the response from the server
	 boolean loginSuccessful = client.receiveLoginResponse(); 
			 
	    // Handle the login response
			 handleLoginResponse(loginSuccessful);
     
               return loginSuccessful;
}
       private void handleLoginResponse(boolean loginSuccessful) {
          if (loginSuccessful) {
          // Handle successful login
           System.out.println("Login successful!");
          // Proceed with further actions for successful login
         } else {
         // Handle failed login
         System.out.println("Login failed. Please check your credentials.");
         // Handle failed login appropriately
                 }
}   


}
