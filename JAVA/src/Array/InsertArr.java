package Array;
import java.lang.reflect.Array;
import java.util.*;
public class InsertArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cap = in.nextInt();
        int pos = in.nextInt();
        int element = in.nextInt();
        int[] arr = new int[cap];
        arr[0]=1;
        arr[1]=23;
        arr[2]=44;
        int n = 3;
        System.out.println(Insert(cap,pos,element,arr,n));
        System.out.println(Arrays.toString(arr));
    }
    
    static int Insert(int cap,int pos,int element,int[] arr,int n) {
        Scanner in = new Scanner(System.in);
        int arrLength = arr.length;
        
        if(n==cap){
            return n;
        }
        int findIndex = pos-1;
        for(int i = n-1;i>=findIndex;i--){
            arr[i+1]=arr[i];
        }
        arr[findIndex] = element;
        return n+1;
    }
}
