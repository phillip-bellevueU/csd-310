/*
 * Phillip thoendel - Mod10 - 11/20/2023
 * this program will generate several arrays of different datatype
 * an overloaded method will print the array and determine the average for each data type
 * 
 */
public class Mod10 {

    public static void main(String[] args) {
     
    //loop for int array      
    int array[] = new int [10];

    for(int i = 0; i < array.length; ++i){

      array[i] = (int)(Math.random() * 100 + 1);
    }

    //loop for short array
    short arrayShort[] = new short [10];

    for(short i = 0; i < arrayShort.length; ++i){

      arrayShort[i] = (short)(Math.random() * 100 + 1);
    }

    //loop for double array
    double arrayDouble[] = new double [10];

    for(int i = 0; i < arrayDouble.length; ++i){

      arrayDouble[i] = (double)(Math.random() * 100 + 1);
      String twoDecimal = String.format("%.2f", arrayDouble[i]); //format double to string to have 2 decimals for readibility
      arrayDouble[i] = Double.parseDouble(twoDecimal); //convert string to double
    }

    //loop for long array
    long arrayLong[] = new long [10];

    for(int i = 0; i < arrayLong.length; ++i){

      arrayLong[i] = (long)(Math.random() * 100 + 1);
    }

    //call methods
    System.out.println();
    System.out.println(Mod10.average(array));
    System.out.println();

    System.out.println(Mod10.average(arrayShort));
    System.out.println();

    System.out.println(Mod10.average(arrayDouble));
    System.out.println();

    System.out.println(Mod10.average(arrayLong));
    System.out.println();
}   

// method for int print and avg
public static int average(int [] array){
     System.out.print("Method with int array: "); 
    for(int i = 0; i < array.length; ++i){

        System.out.print(array[i]);
        System.out.print(", ");
    }
    System.out.println();
    System.out.print("Average of Method with int array: ");
     return + (array[0] + array[1] + array[2] + array[3] + array[4]
           + array[5] + array[6] + array[7] + array[8] + array[9]) / 10;
  
    }

// method for short print and avg    
public static short average(short [] arrayShort){
    System.out.print("Method with short array: ");  
    for(short i = 0; i < arrayShort.length; ++i){

        System.out.print(arrayShort[i]);
        System.out.print(", ");
    }
    System.out.println();
    System.out.print("Average of Method with short array: ");
     return (short) ((arrayShort[0] + arrayShort[1] + arrayShort[2] + arrayShort[3] + arrayShort[4]
           + arrayShort[5] + arrayShort[6] + arrayShort[7] + arrayShort[8] + arrayShort[9]) / 10); 
    }

    // method for double print and avg
public static double average(double [] arrayDouble){
    System.out.print("Method with double array: ");  
    for(int i = 0; i < arrayDouble.length; ++i){

        System.out.print(arrayDouble[i]);
        System.out.print(", ");
    }
    System.out.println();
    System.out.print("Average of Method with double array: ");
     return (arrayDouble[0] + arrayDouble[1] + arrayDouble[2] + arrayDouble[3] + arrayDouble[4]
           + arrayDouble[5] + arrayDouble[6] + arrayDouble[7] + arrayDouble[8] + arrayDouble[9]) / 10;
  
    }

    //method for long print and avg
public static long average(long [] arrayLong){
    System.out.print("Method with long array: ");  
    for(int i = 0; i < arrayLong.length; ++i){

        System.out.print(arrayLong[i]);
        System.out.print(", ");
    }
    System.out.println();
    System.out.print("Average of Method with long array: ");
     return (arrayLong[0] + arrayLong[1] + arrayLong[2] + arrayLong[3] + arrayLong[4]
           + arrayLong[5] + arrayLong[6] + arrayLong[7] + arrayLong[8] + arrayLong[9]) / 10;
    }
}















