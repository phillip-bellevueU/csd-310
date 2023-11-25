/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Multiple Times Invoking a Method
 */
public class Example_002{

  public static void main(String [] args){

    Example_002.printHelloWorld();
    System.out.println();
    Example_002.printHelloWorld();
    System.out.println();
    Example_002.printHelloWorld();
    System.out.println();
  }

  public static void printHelloWorld(){

    System.out.println("Hello World!");
  }
}