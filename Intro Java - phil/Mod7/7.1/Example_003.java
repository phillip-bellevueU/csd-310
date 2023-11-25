/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using Iteration to Invoke Methods
 */
public class Example_003{

  public static void main(String [] args){

    for(int i = 0; i < 5; ++i){

      Example_003.printHelloWorld();
      System.out.println();
    }
  }

  public static void printHelloWorld(){

    System.out.println("Hello World!");
  }
}