/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.util.*;

public class Example_101{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int randomNumber = (int)(Math.random() * 6 + 1);
    int guess;

    System.out.println("Enter a number 1 - 6");
    
    guess = input.nextInt();

    while(guess != randomNumber){

      System.out.println("Please try again ...");
      guess = input.nextInt();
    }

    System.out.println("That is correct.\n");
  }
}