import java.io.*;
import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn =  new Scanner(System.in);
    
    int n = scn.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    
    int span = findSpan(arr);
    System.out.println(span);
    
 }
 
 public static int findSpan(int [] arr){
    int min = arr[0];
    int max = arr[0];
    
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min = arr [i];
        }
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    int span = max - min;
    return span;
 }

}