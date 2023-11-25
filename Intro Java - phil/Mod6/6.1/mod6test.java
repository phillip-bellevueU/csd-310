/*
 * Phillip Thoendel Mod 6 11/3/2023
 * this program will use nested loops to print a text pyramid with "powers of 2" as the body of the pyramid
 * 
 * 
 *          1  
          1 2 1  
        1 2 4 2 1  
      1 2 4 8 4 2 1  
    1 2 4 8 16 8 4 2 1  
  1 2 4 8 16 32 16 8 4 2 1  
1 2 4 8 16 32 64 32 16 8 4 2 1
 * 
 * 
 * 
 * 
 */

public class mod6test {
    public static void main(String[] args) {

             int row;
             int column;
             int space;

        //main loop
        for (row = 1; row <= 7; ++row) {

            //make whitespace around pyramid
            for (space = 1; space <= 7 - row; ++space) {
                System.out.print("  ");
            }

            // print left side of pyramid (ascending)
            for (column = 1; column <= row; ++column) {

                // math function for "powers of" math 
                int num = (int) Math.pow(2, column - 1);
                System.out.print(num + " ");
            }

            // print right side of pyramid (descending)
            for (column = row - 1; column >= 1; --column) {

                // math function for "powers of" math
                int num = (int) Math.pow(2, column - 1);
                System.out.print(num + " ");
            }
           
            //needed to terminate to new line
           System.out.println(" ");
        }
    }
}
















/*public class mod6test {
   
        public static void main(String[] args) {
            int rows = 7;
    
            for (int i = 1; i <= rows; i++) {
                // Print spaces before the stars
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(k + " ");
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    }*/

