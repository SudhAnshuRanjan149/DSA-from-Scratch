package Solutions;

import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int preSpace = 0;
        int postSpace =  n - 2;
        
        for(int i = 1; i <= n; i++){
            // System.out.print(preSpace+" --> "+postSpace + "\t||");
            
            for(int j = 0; j < preSpace; j++){
                System.out.print("\t");
            }
            
            if( i != (n/2)+1 ){
                System.out.print("*");
            }
            
            for(int j = 0; j <= postSpace; j++){
                System.out.print("\t");
            }
            
            System.out.println("*");
            
            if( i <= (n / 2)){
                postSpace -= 2;
                preSpace++;
            }else{
                postSpace += 2;
                preSpace--;
            }
            
        }

    }
}