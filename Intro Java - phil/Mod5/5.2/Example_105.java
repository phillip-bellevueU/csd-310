/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Try this with the values.txt file
 *
 * try
 *   java Example_105 < values.txt
 *   and
 *   java Example_105 < values.txt > output.txt
 */
import java.util.*;

public class Example_105{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    int sentinelValue = -1;
    int valueEntered = 0;

    System.out.println("Enter a Sentinel Value you wish to use...");

    sentinelValue = input.nextInt();

    System.out.println("Enter a value to be added to the sum, -1 to quit...");
    
    valueEntered = input.nextInt();

    while(valueEntered != sentinelValue){

      sum += valueEntered;

      System.out.println("Enter a value to be added to the sum, " + sentinelValue + " to quit...");
      valueEntered = input.nextInt();
    }

    System.out.println("The total sum is " + sum);
  }
}