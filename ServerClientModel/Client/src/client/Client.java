/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        
        String message="" ;
        
       do{
        try {
            //initialize soccket for messaging 
            Socket socket=new Socket("localhost",9999);
            PrintStream printStream=new PrintStream(socket.getOutputStream());
            System.out.println("Enter your message.... ");
            //message from the client
            InputStreamReader inputStreamReader =new InputStreamReader(System.in);
            BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
            message =bufferedReader.readLine();
            
            printStream.println(message);
            
            //Reciver message from the server 
            BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageFromServer =bufferedReader1.readLine();
            System.out.println(messageFromServer);
            
        } catch (Exception e) {
       }
      }while (message.equals("end"));
    }
}
