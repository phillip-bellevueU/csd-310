/* cd C:\Users\philt\OneDrive\Desktop\Bellevue\Session 2\Intro Java\Mod8\8.1
 * java Mod8_sketch.java
 * Phillip Thoendel - 11-14-2023 - Mod8
 * This program will use several methods to simulate service fees
 */


public class Mod8 {
   
  public static void main(String [] args){ 
   
    //variables for parameter placeholders
    double oil = 20;
    double tire = 60;
    double coupon = 15;

   //welcome message 
   System.out.println(); 
   System.out.println("Welcome to the auto service estimator:");
   System.out.println();

   // loop to print all 4 methods x2
   for (int i = 0; i < 2; i++) {
    System.out.println("Annual maintenance fee: " + Mod8.yearlyService());
    System.out.println(" + oil change " + Mod8.yearlyService(oil));
    System.out.println(" + oil change + tire rotation " + Mod8.yearlyService(oil, tire));
    System.out.println(" + oil change + tire rotation + discount coupon " + Mod8.yearlyService(oil, tire, coupon));
    System.out.println();
   }
   //goodbye message outside of loop
   System.out.println();
   System.out.println("Thank for using the auto service estimator, goodbye.");
  }

    //yearly service fee method
    public static double yearlyService(){
     return 60 ;
    }
    //fee + oil method
    public static double yearlyService(double oil){
     return (60 + oil);
    }
    //fee + oil + tire method 
      public static double yearlyService(double oil, double tire){
     return (60 + oil + tire);
    }
    //fee + oil + tire method + discount
      public static double yearlyService(double oil, double tire, double coupon){
     return (60 + oil + tire - coupon);
    }
    
}