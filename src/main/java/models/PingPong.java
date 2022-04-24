package models;

import java.util.ArrayList;

public class PingPong {
    public ArrayList<Object> runPingPong(int countUpTo) {
        ArrayList<Object> result = new ArrayList<Object>(); // Creates an ArrayList called result
        for(int i = 1; i <= countUpTo; i++) { // Loops up to the number provided starting from 1
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("pingpong"); // If divisible by both 3 and 5, adds pingpong to the result ArrayList
            }
            else if (i % 3 == 0) {
                result.add("ping"); // If divisible by 3, adds ping to the result ArrayList
            }
            else if (i % 5 == 0) {
                result.add("pong"); // If divisible by 5, adds pong to the result ArrayList
            }
            else {
                result.add(i); // Else if not divisible by 3 or 5, then adds the number instead to the result ArrayList
            }
        }
        return result; // After loop ends, we return the result ArrayList
    }
}
