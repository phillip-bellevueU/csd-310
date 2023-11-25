/* cd C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod7
 * java Mod7_sketch.java
 * 
 * Phillip Thoendel - 11/10/2023 - Module 7
 * This program will validate user input to adhere to a specific standard
 * 
 */

import java.util.*;

public class Mod7 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); //init scanner
        int loopCounter = 0;

        //intro messaging
        System.out.println("\nWelcome to the string checker\n");
        System.out.println("Please enter a string that follows the below standard: \n");
        System.out.println("Must contain: 8 characters");
        System.out.println("              a number");
        System.out.println("              one upper case");
        System.out.println("              one lower case\n");
        
        while (loopCounter == 0){  //loop scanner to loop scanner

        System.out.print("Please enter a string: ");
        String userString = input.nextLine();
        System.out.println();

        userString =  Mod7.checkString(userString); //invoke method with parameter

        }   
    }

    public static String checkString(String param){

      boolean hasNumber = false;  //bool placeholder for number
      boolean hasUpper = false;  // bool placeholder for upper
      boolean hasLower = false; //  bool placeholder for lower
    
           for (int i = 0; i < param.length(); i++) { //loop steps through each character in string
             
            // checks for number
            if (Character.isDigit(param.charAt(i))) { 
                hasNumber = true; //if a number is found during the loop bool placeholder flips
                break; //stop loop when it finds character
            }    
        }
        //checks for upper case
        for (int i = 0; i < param.length(); i++) {
                    
            if (Character.isUpperCase(param.charAt(i))) {
                hasUpper = true;
                break;
            }    
        }
        //checks for lower case
        for (int i = 0; i < param.length(); i++) {
                    
            if (Character.isLowerCase(param.charAt(i))) {
                hasLower = true;
                break;
            }    
        }
       
        //prints message to user based on bool placeholder value
        if ((!hasNumber) && (!hasUpper)){

            if (param.length() <= 7){ //check for proper string length
            System.out.println("String must have 8 or more characters");
            }

            System.out.println("String needs a number");
            System.out.println("String needs upper case\n");
            }
            else if ((!hasNumber) && (hasUpper)){
            
                 if (param.length() <= 7){
                 System.out.println("String must have 8 or more characters");
            }
            System.out.println("String needs a number\n");    
            }

            else if ((!hasUpper) && (hasNumber)){

                 if (param.length() <= 7){
                 System.out.println("String must have 8 or more characters");
            }
            System.out.println("String needs upper case \n");
            }
            else if ((!hasLower) && (hasNumber)){

                 if (param.length() <= 7){
                 System.out.println("String must have 8 or more characters");
            }
            System.out.println("String needs Lower case\n");
            }
            else if ((!hasLower) && (!hasNumber)){
                 
                 if (param.length() <= 7){
                 System.out.println("String must have 8 or more characters");
            }
            System.out.println("String needs Lower case");
            System.out.println("String needs a number\n");
            }
            else {
            System.out.println("You entered: " + param + ". That is a valid string\n");
            System.exit(0);
            }
            return param;
        }             
    }


