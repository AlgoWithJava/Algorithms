import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {
    public static void main(String[] args) {
        System.out.print("Enter some words: ");
        // String word = StdIn.readString();
        // System.out.print("Enter your age: ");
        // int age = StdIn.readInt();
        // String hidden = StdIn.readLines();
        // System.out.print("Enter a hidden text: ");
        // boolean empty = StdIn.isEmpty();
        // System.out.println(String.format("Welcome %s and your age is %d and its %b", word, age, empty));
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            StdOut.println(value);
        }
    }
}