import java.io.*;
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    
    displayBarCharts(arr);
 }
 
 public static void displayBarCharts(int [] arr){
    int max = arr[0];
    
    //find max element of arr
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    for(int i = max; i > 0; i--){
        for(int j = 0; j < arr.length; j++){
            if(arr[j] <  i){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
        }
        System.out.println();
    }
    
    
 }

}