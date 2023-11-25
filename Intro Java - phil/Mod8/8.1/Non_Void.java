public class Non_Void {  
        // Non-void method - returns an int 
        public int math(int a, int b) {
          return a + b;
      }
  
      public static void main(String[] args) {
          Non_Void example = new Non_Void();
          
          // Calling non-void method
          int result = example.math(5, 10);
          System.out.println("The result of the addition is: " + result);
      }
  }
  
  
int methodName() {
    // math and things
    return intValue;
}