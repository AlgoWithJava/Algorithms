public class HelloGoodbye {
    public static void main(String[] args) {
        int length = args.length;
        if (length == 2){
            System.out.println(String.format("Hello %s and %s.", args[0], args[1]));
            System.out.println(String.format("Goodbye %s and %s.", args[1], args[0]));
        }
    }
}