import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // Reads text from a character-input stream
        System.out.println("I'm a ping-pong application!"); // Prints out message
        System.out.println("Enter a number:"); // Prompts user to enter a number
        try {
            String stringUserNumber = bufferedReader.readLine(); // Fetching the user input and assigns to stringUserNumber
            int intUserNumber = Integer.parseInt(stringUserNumber); // Converts user input to int using Wrapper Class Integer
            PingPong pingPong = new PingPong(); // Creates a new instance of PingPong Class called pingpong
            ArrayList<Object> pingPongResult =  pingPong.runPingPong(intUserNumber); // Pass user input to the runPingPong() in PingPong class for execution. Checking for divisibility. Returns an ArrayList.
            System.out.println(pingPongResult); // Prints out the result: ArrayList returned by runPingPong()
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
