package Solutions;

import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int space = n / 2;
        int star = 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                if(i == (n/2) + 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            
            if(i <= n/2){
                star++;
            }else{
                star--;
            }
            
        }

    }
}