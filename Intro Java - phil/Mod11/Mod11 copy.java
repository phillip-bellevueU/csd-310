/*
 * Phillip Thoendel - 11/22/2023 - Mod 11
 * This will evalute a 2d array and return the largest and smallest elements
 */
import java.util.Arrays;

public class Mod11{
    public static void main(String[] args) {
    
        int array[][] = new int [5][5];  
      //  int [] bigHolder = Mod11.locationLargest(array);                             //array variable
                                             //
    for(int i = 0; i < array.length; ++i){  // loop to create 2d array
                                           //
        for(int j = 0; j < array[i].length; ++j){
                                         //
           array[i][j] = (int)(Math.random() * 100 + 1);
                                       //
           System.out.print(array[i][j] + ", ");//print 2d array
        }                            //
        System.out.println();       //
    }                              //
        System.out.println();     //call methods 
        System.out.println(Mod11.locateLargest(array));    
  }  
  //############################################################################
                                                     
public static int [] locateLargest (int [][] array){// method to find largest array value
                                                   //
        int[] position = new int[2];              //var for "coordinate holder" 
        int holder = 0;                          //var for holder to find max value
 
        for(int i = 0; i < array.length; ++i){ // loop to read array var
                                              //
            for(int j = 0; j < array[i].length; ++j){
                                            //
                                           //
            if (array[i][j] > holder)     //holds current largest array var int
                                         //
            position[0] = i;            //position is updated each time 
            position[1] = j;  
                                  //        
     }                               //
        System.out.println();       //
    }                              //
        return position;          // return "coordinates" of largest array var
    }
  //############################################################################

    //public static int [] locateSmallest (int [][] array)

}


/*
 * 
    for(int i = 0; i < array.length; ++i){   //loop to step through array
                                            //
       big = Math.max(big, array[i]);      //code to get biggest number
       small = Math.min(small, array[i]); //code to get smallest number
                                         //
    }                                   //
                                       //
    for (double sumHolder : array){   //loop to get sum

 * 
 */