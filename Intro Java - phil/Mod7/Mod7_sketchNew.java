/* cd C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod7
 * java Mod7_sketch.java
 * 
 * Phillip Thoendel - 11/10/2023 - Module 7
 * This program will validate user input to adhere to a specific standard
 */

import java.util.*;

public class Mod7_sketchNew {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int loopCounter = 0;

        System.out.println("\nWelcome to the string checker\n");
        System.out.println("Please enter a string that follows the below standard: \n");
        System.out.println("Must contain 8 characters");
        System.out.println("Must contain a number");
        System.out.println("Must contain one uppercase");
        System.out.println("Must contain one lowercase\n");
        
        while (loopCounter <= 0){

        
        System.out.print("Please enter a string: ");
        String userString = input.nextLine();

        userString =  Mod7_sketchNew.checkString(userString);

         Mod7_sketchNew.checkString(userString);  // loopCounter++;

           if (userString.length() <= 7) {

            System.out.println("String must have more than 8 characters");
        }
         if (Character.isDigit(userString.charAt(i)) == false) {
            
             System.out.println("Password must have a number");
        } 

            else {

             System.out.println("You entered: " + userString);
             break;
        } 

        }
    }
    
    public static String checkString(String param){

      //  boolean hasNumber = Character.isDigit(param);
        for (int i = 0; i < param.length(); i++){
         }

        return param;
        
    }
}        
   /* public static String checkString(String param){

      //  boolean hasNumber = Character.isDigit(param);
        for (int i = 0; i < param.length(); i++)
        {

        if (param.length() <= 7) {

            System.out.println("Password must have more than 8 characters");
        } 

        if (Character.isDigit(param.charAt(i)) == false) {
            
             System.out.println("Password must have a number");
        }

        else {
             System.out.println("You entered" + param);
        }

        }

        return param;
        
    }
}   */ 
               


