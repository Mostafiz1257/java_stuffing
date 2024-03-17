import java.util.Scanner;

public class max_min_array {
    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int number[] = new int [size];
    // for(int i=0; i<size;i++){
    // number[i] = sc.nextInt();
    // }
    // int max=number[0];
    // int min=number[0];
    // for(int i= 0;i<number.length;i++){
    // if(number[i]>max){
    // max=number[i];
    // }
    // if(number[i]<min){
    // min=number[i];
    // }
    // }
    // System.out.println("Max number is"+max);
    // System.out.println("Min number is"+min);
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int min=num[0];
        int max=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]<min) {
                min= num[i];
             
            }
            if(num[i]>max){
                max=num[i];
               
            }
        }
        System.out.println("this is min number"+min);
        System.out.println("this is the max number"+max);
    }
}
