package Recursion;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner inputArr = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = inputArr.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = inputArr.nextInt();
        }
        reveArr(arr, 0, size);
        System.out.println("The array after reversing is: " + Arrays.toString(arr));
        }
        
        static void reveArr(int[] arr, int start, int end) {
            if (start >= end/2) {
                return;
            }
            int temp = arr[start];
            arr[start] = arr[end-start-1];
            arr[end-start-1] = temp;
            reveArr(arr, start + 1, end);
        }
  
}
