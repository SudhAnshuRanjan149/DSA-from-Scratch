import java.util.*;
  
  public class printFibonacciTillN{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();

	  scn.close();
      
      printFibonacciTill_N(n);
   }
   public static void printFibonacciTill_N(int num){
    //   if(num == 1){
    //       System.out.println(0);
    //       return;
    //   }else if(num == 2){
    //       System.out.println(0);
    //       System.out.println(1);
    //       return;
    //   }else{
    //       System.out.println(0);
    //       System.out.println(1);
    //       int i = 0;
    //       int j = 1;
    //       for(int c = 3;c<=num;c++){
    //           int next = i + j;
    //           i = j;
    //           j = next;
               
    //           System.out.println(next);
    //       }
    //   }
    
    
    //more optimised
    int a = 0;
    int b = 1;
    for(int i = 0; i < num; i++){
        System.out.println(a);
        int c = a + b;
        a = b;
        b = c;
    }
   }
  }
