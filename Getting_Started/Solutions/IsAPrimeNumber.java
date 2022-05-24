import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
  
    // write ur code here
    int t = scn.nextInt();
    for(int i = 0; i < t;i++){
        int n = scn.nextInt();
        isPrime(n);
    }
    
   }
   
   public static void isPrime(int num){
        for(int i = 2; i * i <= num;i++){
            if(num % i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
        return;
   }
  }