import java.util.*;

public class PrimeFactorizationOfANumber{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  
  int n = scn.nextInt();
  
  int div = 2;
  while(n != 1){
    if(n % div == 0){
        System.out.print(div+" ");
        n = n / div;
    }else{
        div++;
    }
  }
 }
}