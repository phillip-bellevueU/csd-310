/* cd C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod7
 * java Mod7_sketch.java
 * 
 * Phillip Thoendel - 11/10/2023 - Module 7
 * This program will validate user input to adhere to a specific standard
 */

import java.util.*;

public class Mod7_sketch_4 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int loopCounter = 0;

        System.out.println("\nWelcome to the string checker\n");
        System.out.println("Please enter a string that follows the below standard: \n");
        System.out.println("Must contain 8 characters");
        System.out.println("Must contain a number");
        System.out.println("Must contain one uppercase");
        System.out.println("Must contain one lowercase\n");
        
        while (loopCounter < 5){

        
        System.out.print("Please enter a string: ");
        String userString = input.nextLine();

        userString =  Mod7_sketch_4.checkString(userString);

         Mod7_sketch_4.checkString(userString);

         loopCounter++;

        }
        System.out.println("You know what? Don't worry about it.");
    }

    public static String checkString(String param){
        int i = 0; 
      //  boolean hasNumber = Character.isDigit(param);
        for (i = 0; i < param.length(); i++)
        {
        }
        //  param = param.matches(".*\\d+.*");
        
        if (param.length() <= 7) {

            System.out.println("Password must have more than 8 characters");
        } 

        if (Character.isDigit(param.charAt(i)) == false) {
            
             System.out.println("Password must have a number");
        }

        else {
             System.out.println("You entered" + param);
        }

        
        return param;
        
    }
}    
               


