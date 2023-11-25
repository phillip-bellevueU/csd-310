/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Reusable Code Blocks
 *
 * A Definition consists of:
 *  Signature, Part of a Method Declaration:
 *    Method Name
 *    Parameter List
 *  Return Type
 *  Access Modifier (Optional) (public, private, ...)
 *  Access Modifier (Optional) (static)
 */
public class Example_001{

  public static void main(String [] args){

    Example_001.printHelloWorld();

    // Works, however not always considered the best option.
    printHelloWorld();

    System.out.println();
  }

  public static void printHelloWorld(){

    System.out.println("Hello World!");
  }
}