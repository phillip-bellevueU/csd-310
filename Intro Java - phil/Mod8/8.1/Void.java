public class Void {

    // Void - does not return any value
    public void printMessage() {
        System.out.println("Hello, this is a void method!");
    }

    public static void main(String[] args) {
        Void example = new Void();
        
        // Calling the void method
        example.printMessage();
    }
}