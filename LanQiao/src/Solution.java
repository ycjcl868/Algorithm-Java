import java.util.Scanner;

/**
 * Created by jcl on 16/11/15.
 */
public class Solution {
    public static void main(String[] args){
//        String s1 = "hello";
//        String reverse = new Solution().reverseString(s1);
//        System.out.println(reverse);


    }
    public int solve(int a){
        int[] arr = new int[a+1];
        arr[1]=arr[2]=1;
        for(int i = 3;i < arr.length;i++){
            arr[i] = (arr[i-1]+arr[i-2])%10007;
        }
        return arr[a];
    }
    public String reverseString(String s){
        String reverse  = new StringBuffer(s).reverse().toString();
        return reverse;
    }

}
