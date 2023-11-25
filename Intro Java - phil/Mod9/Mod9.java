/* Mod8
 * Phillip Thoendel - 11-17-23
 * C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod
 * This program will initialize an array and manipulate it 
 */
public class Mod9{

  public static void main(String[] args){

                                  //init array
    double [] array = {1, 17, 22, 94, 23, 54, 66, 34, 45, 36, 77, 53, 77, 87, 76, 90, 91, 32, 19, 123};
                                //
    double total = 0;          //var for sum
    double big = array[0];    //var for biggest array element
    double small = array[0]; //var for smallest array element
   
    
    for(int i = 0; i < array.length; ++i){   //loop to step through array
                                            //
       big = Math.max(big, array[i]);      //code to get biggest number
       small = Math.min(small, array[i]); //code to get smallest number
                                         //
    }                                   //
                                       //
    for (double sumHolder : array){   //loop to get sum

       total += sumHolder;
   }
   
   double arrayAvg = total / array.length; //var for average
  
   System.out.println();
   System.out.println("The largest array element is:  " + big);         //print big
   System.out.println("The smallest array element is: " +small);       //print small
   System.out.println("The sum of the array is:       " + total);     //print total
   System.out.println("The array average is:          " + arrayAvg); //print avg

  }

}
 