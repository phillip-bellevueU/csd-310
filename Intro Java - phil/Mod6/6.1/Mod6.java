/*
 * Phillip Thoendel Mod 6 11/3/2023
 * this program will use nested loops to print a text pyramid with "powers of 2" as the body of the pyramid
 * 
 *  output
 *            1  
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
public class Mod6 {

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
                int modifier_1 = (int) Math.pow(2, column - 1);
                System.out.print(modifier_1 + " ");
            }

             // print right side of pyramid (descending)
            for (column = row - 1; column >= 1; --column) {

                // math function for "powers of" math
                int modifer_2 = (int) Math.pow(2, column - 1);
                System.out.print(modifer_2 + " ");
            }
             //terminates to new line for every iteration of main loop
            System.out.println(" ");
        }
    }
}



