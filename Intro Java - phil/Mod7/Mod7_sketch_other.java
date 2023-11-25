/* cd C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod7
 * java Mod7_sketch.java
 * 
 * Phillip Thoendel - 11/10/2023 - Module 7
 * This program will validate user input to adhere to a specific standard
 * main working copy
 */

import java.util.*;

public class Mod7_sketch_other {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int loopCounter = 0;

        System.out.println("\nWelcome to the string checker\n");
        System.out.println("Please enter a string that follows the below standard: \n");
        System.out.println("Must contain 8 characters");
        System.out.println("Must contain a number");
        System.out.println("Must contain one uppercase");
        System.out.println("Must contain one lowercase\n");
        
        while (loopCounter < 10){

        
        System.out.print("Please enter a string: ");
        String userString = input.nextLine();

        userString =  Mod7_sketch_other.checkString(userString);

        // Mod7_sketch_other.checkString(userString);
         loopCounter++;

        }
        
        System.out.println("You know what? Don't worry about it.");
    }

  
    public static String checkString(String param){

      boolean hasNumber = false;
     // boolean hasUpper = false;
     // boolean hasLower = false;

         if (param.length() <= 7){

            System.out.println("String must have more than 8 characters");
         }
         else {
           for (int i = 0; i < param.length(); i++) {
                    
            if (Character.isDigit(param.charAt(i))) {
            hasNumber = true;
            break;
            }    
        }

         if (!hasNumber){
            System.out.println("String needs a number");
         }
        }
         return param;
   
        }             
}

