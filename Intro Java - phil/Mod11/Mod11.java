/*
 * Phillip Thoendel - 11/22/2023 - Mod 11
 * This will evalute a 2d array and return the largest and smallest elements
 */
import java.util.Arrays;

public class Mod11{
    public static void main(String[] args) {
    
        int array[][] = new int [5][5];  
                                             
    for(int i = 0; i < array.length; ++i){  // loop to create 2d array
                                           
        for(int j = 0; j < array[i].length; ++j){
                                         
           array[i][j] = (int)(Math.random() * 100 + 1);
                                       
           System.out.print(array[i][j] + ", ");//print 2d array
        }                            
        System.out.println();       
    }                              
        System.out.println();     //call methods 
        int[] largestPosition = Mod11.locateLargest(array); //convert array to string for readibility
        System.out.println("Largest element position: " + Arrays.toString(largestPosition)); 

        int[] smallestPosition = Mod11.locateSmallest(array); //convert array to string for readibility
        System.out.println("Smallest element position: " + Arrays.toString(smallestPosition));   
    }   
    
  //############################################################################
                                                     
public static int [] locateLargest (int [][] array){
                                                   
        int[] position = new int[2];              //var for "coordinate holder" 
        int holder = Integer.MIN_VALUE;          //var for holder to find max value
 
        for(int i = 0; i < array.length; ++i){ // loop to read array var
                                              
            for(int j = 0; j < array[i].length; ++j){
                                                                                      
            if (array[i][j] > holder) {    //holds current largest array var int
                                         
            holder = array[i][j];
            position[0] = i;            //position is updated each time 
            position[1] = j;  
        }                                         
     }      
          
    }                              
        return position;          // return "coordinates" of largest array var
 }

  //############################################################################

public static int [] locateSmallest (int [][] array){
                                                   
        int[] position = new int[2];              //var for "coordinate holder" 
        int holder = Integer.MAX_VALUE;          //var for holder to find min value
 
        for(int i = 0; i < array.length; ++i){ // loop to read array var
                                              
            for(int j = 0; j < array[i].length; ++j){
                                                                                      
            if (array[i][j] < holder) {    //holds current smallest array var int
                                         
            holder = array[i][j];
            position[0] = i;            //position is updated each loop iteration 
            position[1] = j;   
         }
     }                                         
    }                              
        return position;          // return "coordinates" of largest array var
    }
}
