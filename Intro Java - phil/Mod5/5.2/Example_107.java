/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.util.*;

public class Example_107{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int randomNumber = (int)(Math.random() * 100 + 1);
    int guess = 0;

    do{

      System.out.println("Enter a number 1 - 100");
     
      guess = input.nextInt();

      if(guess > randomNumber){

        System.out.println("That guess is to high.");
      }
      else if(guess < randomNumber){

        System.out.println("That guess is to low.");
      }

    }while(guess != randomNumber);

    System.out.println("That is correct.\n");
  }
}