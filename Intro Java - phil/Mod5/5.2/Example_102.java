/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.util.*;

public class Example_102{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int randomNumber = (int)(Math.random() * 100 + 1);
    int guess;

    System.out.println("Enter a number 1 - 100");
    
    guess = input.nextInt();

    while(guess != randomNumber){

      if(guess > randomNumber){

        System.out.println("That guess is to high.");
      }
      else{

        System.out.println("That guess is to low.");
      }

      System.out.println("Please try again ...");
      guess = input.nextInt();
    }

    System.out.println("That is correct.\n");
  }
}