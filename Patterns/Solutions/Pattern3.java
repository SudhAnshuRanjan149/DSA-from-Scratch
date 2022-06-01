package Solutions;

import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int space = n - 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            space--;
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}