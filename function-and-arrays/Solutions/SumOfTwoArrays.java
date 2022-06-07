import java.io.*;
import java.util.*;

public class SumOfTwoArrays{

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
    
    
    int [] sumArr = findSumOfTwoArrays(arr1,arr2);
    displayArray(sumArr);
 }
 
 public static int[] findSumOfTwoArrays(int [] arr1, int [] arr2){
    int [] maxArray;
    int [] minArray;
    
    //find array with max length
    if(arr1.length > arr2.length){
        maxArray = arr1;
        minArray = arr2;
    }else{
        maxArray = arr2;
        minArray = arr1;
    }
    
    int [] sumArray = new int[maxArray.length + 1];
    
    int maxArrayLastIndex = maxArray.length - 1;
    int minArrayLastIndex = minArray.length - 1;
    int carry = 0;
    
    for(int i = sumArray.length - 1; i >= 0; i--){
        int max = 0;
        int min = 0;
        if(maxArrayLastIndex >= 0){
            max = maxArray[maxArrayLastIndex];
        }
        if(minArrayLastIndex >= 0){
            min = minArray[minArrayLastIndex];
        }
        maxArrayLastIndex--;
        minArrayLastIndex--;
        
        
        int sum = max + min + carry;
        carry = sum / 10;
        sum = sum % 10;
        
        sumArray[i] = sum;
    }
    
    return sumArray;
    
 }
 
 public static void displayArray(int [] array){
    
    boolean flag = false;
    
    for(int i = 0; i < array.length; i++){
        if(array[i] == 0 && flag == false){
            flag = true;
        }else{
            System.out.println(array[i]);
        }
        
    }
 }

}
