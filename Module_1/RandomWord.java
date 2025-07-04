import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * TODO :  How To Run:
 *  javac -cp .:algs4.jar RandomWord.java
 *   java -cp .:algs4.jar RandomWord
 *   You Can Run it Normally With IntelliJ IDEA Code Editor
 */

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (StdRandom.bernoulli(1.0/i)){
                champion = word;
            }
            i++;
        }
        StdOut.println(champion);
    }
}

