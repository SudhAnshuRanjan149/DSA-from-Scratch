import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int sum = 0;
       int pow = 0;
       
       int carry = 0;
       
       while(n1 != 0 || n2 != 0){
           int rem1 = 0;
           int rem2 = 0;
           
           if(n1 != 0){
            rem1 = n1 % 10;
            n1 /= 10;
           }
            
           if(n2 != 0){
            rem2 = n2 % 10;
            n2 /= 10;
           }
            
           int s = rem1 + rem2 + carry;
           
           carry = s / b;
           s %= b; 
           sum += s * (int)Math.pow(10,pow);
           pow++;
       }
       
       if(carry != 0){
          sum += carry * (int)Math.pow(10,pow); 
       }
       
       return sum;
   }
  }