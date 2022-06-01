package Solutions;

import java.util.*;

public class Pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
    int n = scn.nextInt();
    
    int preSpace = n / 2;
    int midSpace = -1;
    
    for(int i = 1; i <= n; i++){
        // System.out.print(preSpace + " --> " + midSpace + "\t||");
        
        for(int j = 1; j <= preSpace; j++){
            System.out.print("\t");
        }
        if(i != 1 && i != n){
            System.out.print("*\t");
        }
        
        for(int j = 1; j <= midSpace; j++){
            System.out.print("\t");
        }
        
         System.out.println("*");
         
         if(i <= (n/2)){
            preSpace--;
            midSpace += 2;
         }else{
            preSpace++;
            midSpace -= 2;
         }
        
    }

 }
}