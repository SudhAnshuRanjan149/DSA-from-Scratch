package Solutions;

import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int space = n / 2;
        int star = 1;
        int c = 1;
        for(int i = 1; i <= n; i++){
            // System.out.print(space+"\t"+star+"|| ");
            
            
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= star; j++){
                System.out.print(c + "\t");
                
                if( j <= star/2){
                    c++;
                }else{
                    c--;
                }
            }
            
            // System.out.print("||"+c);
            
            
            
            if( i <= n/2){
                star += 2;
                space--;
                c +=2;
            }else{
                star -= 2;
                space++;
                // c++;
            }
            
            // System.out.print("||"+c);
            System.out.println();
            
        }

    }
}