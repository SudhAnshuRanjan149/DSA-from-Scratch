import java.util.*;
   
   public class Reverse_a_Number{
       private static void printDigitsInReverse(int num){
           while(num != 0){
               int rem  = num  % 10;
               System.out.println(rem);
               num /= 10;
           }
       }
   
        public static void main(String[] args) {
             // write your code here  
             Scanner scn = new Scanner(System.in);
             int n = scn.nextInt();
             
             printDigitsInReverse(n);
        }
   }
