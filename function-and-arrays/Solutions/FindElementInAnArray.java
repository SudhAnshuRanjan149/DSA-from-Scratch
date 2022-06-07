import java.io.*;
import java.util.*;

public class FindElementInAnArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    
     int d = scn.nextInt();
     
     int index = findIndex(arr,d);
     System.out.println(index);
    
 }
 public static int findIndex(int [] arr, int d){
    
    for(int i = 0; i < arr.length;i++){
        if(arr[i] == d){
            return i;
        }
    }
    return -1;
 }

}