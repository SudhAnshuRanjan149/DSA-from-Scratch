import java.util.*;

public class PrintAllPrimesTill_N{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i = low; i<=high;i++){
            isPrime(i);
        }
    }
    public static void isPrime(int num){
        for(int i = 2;i * i <= num;i++){
            if(num % i == 0){
                return;
            }
        }
        System.out.println(num);
        return;
    }
}