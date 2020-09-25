package server_sock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Sock {
    public static void main(String[] args) {
        while (true) {            
            
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            Socket socket =serverSocket.accept();
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = bufferedReader.readLine();
            System.out.println("Message form client: "+message);
            
            //message from server to the client 
            PrintStream printStream =new PrintStream(socket.getOutputStream());
            String serverMessage="Yes i get it !";
            printStream.println(serverMessage);
            
        } catch (Exception e) {
 
        }
      }
    }
    
}
