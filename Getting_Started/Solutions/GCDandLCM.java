public class GCDandLCM {
	
}

// Not complete
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      
    //   findGCD(num1,num2);
      findLCM(num1,num2);
     }
     
    //  public static void findGCD(num1,num2){
         
    //  }
     public static void findLCM(int num1,int num2){
        int div = 2;
        int ans = 1;
        
        while(num1 != 0 && num2 != 0){
            ans = ans * div;
             int rem1 = num1 % div;
             int rem2 = num2 % div;
             
             if(rem1 != 0 && rem2 != 0){
                 div++;
             }else if(rem1 == 0 && rem2 == 0){
                 num1 = num1 / div;
                 num2 = num2 / div;
             }else if(rem1 == 0){
                 num1 = num1 / div;
             }else{
                  num2 = num2 / div;
             }
        }
        
        System.out.println(ans);
     }
    }
