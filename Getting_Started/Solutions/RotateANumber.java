import java.util.*;
   
   public class RotateANumber{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     
     int ans = rotate(n,k);
     
     System.out.println(ans);
    }
    public static int rotate(int n,int k){
        int temp = n;
        int nod = 0;
        
        while(temp != 0){
            nod++;
            temp /= 10;
        }
        int k1;
        if(k >= 0){
             k1 = k % nod;
        }else{
             k1 = nod + (k % nod); 
        }
        
        int diff = nod - k1;
        
        int rem = n % (int)Math.pow(10,k1);
        int num1 = rem * (int)Math.pow(10,diff);
        
        int num2 = n / (int)Math.pow(10,k1);
        
        return num1 + num2;
    }
   }