public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(String.format("the lenght of the arguments is: %d", args.length));

        for(int i = 0; i < args.length; i++){
            System.out.println(String.format("Hello, %s", args[i]));
        }
    }
}
