import java.util.Scanner;

public class two_d_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int num[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the x value");
        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==x){

                    System.out.print("X value fount at the position"+i+","+j+" ");
                }
            }
            
        }
    }
}
