import java.util.*;

public class Digits_Of_A_Number {
    private static void printDigits(int num){
        int temp = num;
        int count = 0;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        
        while(count != 0){
            int quo = num / (int)(Math.pow(10,count-1));
            num = num % (int)(Math.pow(10,count-1));
            System.out.println(quo);
            count--;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn =  new Scanner(System.in);
        
        int n = scn.nextInt();

        printDigits(n);
    }
}
