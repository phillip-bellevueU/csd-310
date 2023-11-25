/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using Iteration to Invoke Methods
 */
public class Example_004{

  public static void main(String [] args){

    for(int i = 0; i < 3; ++i){

      MethodClass.printHelloWorld();
      System.out.println();
    }
  }
}

class MethodClass{

  public static void printHelloWorld(){

    System.out.println("Hello World!");
  }
}