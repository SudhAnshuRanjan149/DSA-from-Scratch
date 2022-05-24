import java.util.*;
  
  public class countDigits{
    private static void countDigits(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num / 10;
        }
        
        System.out.println(count);
        return;
    }
  
    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        countDigits(n);
    }
  }
