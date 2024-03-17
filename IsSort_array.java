// import java.util.Scanner;

import java.util.Arrays;

public class IsSort_array {
    //
    public static void main(String args[]) {
        int arr[] = { 4, 5, 3, 6, 3, 5 };
        Arrays.sort(arr);
        for(int i=arr.length-1;i<=0;i--){
            System.out.println(arr[i]);
        }
    }
}