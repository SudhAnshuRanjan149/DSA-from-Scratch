import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int pow = 0;
      int numberAtBase10 = 0;
      
      while(n != 0){
          int rem = n % 10;
          
          numberAtBase10 += rem * (int)Math.pow(b,pow);
          pow++;
          n /= 10;
      }
      
      return numberAtBase10;
   }
  }
