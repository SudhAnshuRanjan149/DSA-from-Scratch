package Solutions;

import java.util.*;

public class Pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     
     int space = (n * 2) - 3;
     int star = 1;
     int c = 1;
     
     for(int i = 1; i <= n; i++){
         
        // System.out.print(star + " --> "+ space + " || ");
        
        for(int j = 1; j <= star; j++){
            System.out.print(c+"\t");
            c++;
        }
        for(int j = 1; j <= space; j++){
            System.out.print("\t");
        }
        c--;
        for(int j = 1; j <= star; j++){
         if(i == n && j == 1){
         }else{
            System.out.print(c+"\t");
         }
            c--;
        }
        c++;
        
        System.out.println();
        star++;
        space -= 2;
     }

 }
}