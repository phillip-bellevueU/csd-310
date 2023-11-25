/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.util.*;

public class Example_106{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int randomNumber = (int)(Math.random() * 6 + 1);
    int guess = 0;

    do{

      System.out.println("Enter a number 1 - 6");
    
      guess = input.nextInt();

    }while(guess != randomNumber);

    System.out.println("That is correct.\n");
  }
}