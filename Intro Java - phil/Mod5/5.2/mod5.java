/*
 * Phillip Thoendel Mod5 11/1/2023
 * this program will use a loop to do math
 * and stop when conditions have been reached
 */
public class mod5 {
    
        public static void main(String[] args) {
            
            //init totals
            double upTotal = 0.0;
            double downTotal = 0.0;
            
            //loop for math in ascending order
            double denom = 3;
            // stops when demon = 99
            while (denom <= 99) {
                upTotal += 1.0 / denom;
                denom += 2;
            }
            
            //loop for math in descending order
            denom = 99;
            // stops when demon = 3
            while (denom >= 3) {
                downTotal += 1.0 / denom;
                denom -= 2;
            }
               //print results
            System.out.println("Total ascending sum of (1/3.0 to 1/99.0) = " + upTotal);
            System.out.println("Total descending sum of (1/99.0 to 1/3.0)" + downTotal);

        }
    }

