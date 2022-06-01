import java.util.*;
    
    public class GCDandLCM{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      
      int GCD = findGCD(num1,num2);
      System.out.println(GCD);
      int LCM = (num1 * num2) / GCD;
      System.out.println(LCM);
     }
     
     public static int findGCD(int num1,int num2){
         int div = num1;
         int max = num2;
         if(num1 > num2){
            max = num1;
            div = num2;
         }
         
         int rem = max % div;
         while(rem != 0){
            max = div;
            div = rem;
            rem = max % div;
         }
         return div;
     }
    }
