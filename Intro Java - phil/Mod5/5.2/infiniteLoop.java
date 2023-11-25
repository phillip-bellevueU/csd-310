public class infiniteLoop {

public static void main(String[] args) {
   
    int i = 0;
// there is nothing to increment our int so it runs infinitely 
while (i < 5) {
    System.out.println("Will this goes on forever?");
    
    //to fix this problem we can increment our variable
     ++i;
}
}
    
}
