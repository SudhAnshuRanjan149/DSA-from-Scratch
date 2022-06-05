import java.util.*;
  
  public class AnyBaseToAnyBase{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int  destBase= scn.nextInt();
    
    int preAns = AnyBaseToDecimal(n,sourceBase);
    int finalAns = DecimalToAnyBase(preAns,destBase);
    
    
    System.out.println(finalAns);
   }   
   
   public static int AnyBaseToDecimal(int n,int sb){
       
       int pow = 0;
       int numberAtBase10 = 0;
       
       while(n != 0){
            int rem  = n % 10;
            numberAtBase10 += rem * (int)Math.pow(sb,pow);
            pow++;
            n /= 10;
       }
       
       return numberAtBase10;
   }
     public static int DecimalToAnyBase(int n,int db){
       
       int pow = 0;
       int numberAtBaseDB = 0;
       
       while(n != 0){
            int rem  = n % db;
            numberAtBaseDB += rem * (int)Math.pow(10,pow);
            pow++;
            n /= db;
       }
       
       return numberAtBaseDB;
   }
  }