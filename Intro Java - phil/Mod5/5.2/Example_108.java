w/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Control Loop with "InputDialog"
 */
import javax.swing.*;

public class Example_108{

  public static void main(String [] args){

    int i = 0;

    do{

      i = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive interger to continue ..."));

      System.out.printf("The value entered is %d\n", i);

    }while(i > 0);

    System.out.println("This program has ended.");
  }
}