import java.io.*;
import java.util.*;

public class DifferenceOfTwoArrays{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int [] arr1 = new int[n1];
    
    for(int i = 0; i < n1; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int [] arr2 = new int[n2];
    
    for(int i = 0; i < n2; i++){
        arr2[i] = scn.nextInt();
    }
    
    int [] diff = new int[n1 > n2? n1 : n2];
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = diff.length - 1;
    
    int b = 0;
    
    while(k >= 0){
        int d = b;
        
        if(j >= 0){
            d += arr2[j];
        }
        if(i >= 0){
            d -= arr1[i];
        }
        
        if(d >= 0){
            b = 0;
        }else{
            b = -1;
            d += 10;
        }
        
        
        diff[k] = d;
        
        i--;
        j--;
        k--;
    }
    
    boolean flag = false;
    
    for(int val: diff){
        if(val == 0 && flag == false){
        }else{
            System.out.println(val);
            flag = true;
        }
       
    }
    
 }

}