package Arrays.Questions;
import java.util.*;
public class MatrixBoundary {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        if(row==1){
            for (int i = 0; i <col ; i++) {
                System.out.println(arr[0][i] + " ");
            }
        } else if(col==1){
            for (int i = 0; i <row ; i++) {
                System.out.println(arr[i][0] + " ");
            }
        } else{
            for (int i = 0; i <col ; i++) {
                System.out.println(arr[0][i] + " ");
            }
            for (int i = 1; i <row ; i++) {
                System.out.println(arr[i][col-1]);
            }
            for (int i = col-2; i >=0 ; i--) {
                System.out.println(arr[row-1][i] + " ");
            }
            for (int i = row-2; i >=1 ; i--) {
                System.out.println(arr[i][0] + " ");
            }
        }
        };
}
