import java.util.*;
  
  public class DecimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       
       int pow = 0;
       int numberAtBaseB = 0;
       
       while(n != 0){
           int rem = n % b;
           numberAtBaseB += rem * (int)Math.pow(10,pow); 
           pow++;
           n /= b;
       }
       return numberAtBaseB;
   }
  }