import java.util.*;
  
  public class AnyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       
       //rv --> return value
       int rv = 0;
       
       // c --> carry , bo --> borrow
       int c = 0;
       int bo = 0;
       
       // pow --> power of 10
       int pow = 0;
       
       while(n1 > 0 || n2 > 0){
           int d2 = n1 % 10;
           int d1 = n2 % 10;
           
           n1 /= 10;
           n2 /= 10;
           
           int s = 0;
           
           if(d1 + bo + c  < d2){
               bo = b;
               s = d1 + bo + c - d2;
               c = -1;
               bo = 0;
           }else{
               s = d1 + bo + c - d2;
               c = 0;
               bo = 0;
           }
           
           rv += s * (int)Math.pow(10,pow);
           pow++;
       }
      if(c != 0){
        rv += c * (int)Math.pow(10,pow);
      }
       
       return rv;
   }
  
  }
