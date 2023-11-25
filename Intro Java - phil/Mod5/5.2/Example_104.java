/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Sentinel Value
 */
import java.util.*;

public class Example_104{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    int sentinelValue = -1;
    int valueEntered = 0;

    System.out.println("Enter a Sentinel Value you wish to use...");

    sentinelValue = input.nextInt();

    System.out.println("Enter a value to be added to the sum, " + sentinelValue + " to quit...");
    
    valueEntered = input.nextInt();

    while(valueEntered != sentinelValue){

      sum += valueEntered;

      System.out.println("Enter a value to be added to the sum, " + sentinelValue + " to quit...");
      valueEntered = input.nextInt();
    }

    System.out.println("The total sum is " + sum);
  }
}