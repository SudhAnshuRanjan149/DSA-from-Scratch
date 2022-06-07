import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    
    //resize k if k's value is greater than a.length
    k %= a.length;
    
    //give k a positive value corresponding to it's negative value
    if(k < 0){
        k += a.length;
    }
    
    //logic
    // 1 2 3 4 5  --> for k = 2 --> 4 5 1 2 3
    //reverse 0 to a.length - k = 3 -->  3 2 1 4 5
    //reverse a.length - k to a.length -->  3 2 1 5 4
    //reverse whole
    // 4 5 1 2 3 
    
    // 1 2 3 4 5  --> for k = 3 --> 3 4 5 1 2
    //reverse 0 to a.length - k = 2 -->  2 1 3 4 5 
    //reverse a.length - k to a.length -->  2 1 5 4 3
    //reverse whole
    // 3 4 5 1 2
    
    reverseAnArrayByJK(a,0,a.length - k);
    reverseAnArrayByJK(a,a.length - k,a.length);
    reverseAnArrayByJK(a,0,a.length);
    
  }
  public static void reverseAnArrayByJK(int [] a,int j,int k){
    
    int m = k - 1;
    for(int i = j; i < (j+k)/2;i++){
        int temp = a[i];
        a[i] = a[m];
        a[m] = temp;
        m--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}