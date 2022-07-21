package Arrays.Questions;
import java.util.*;
public class MiniumPlatform {
    public static void main(String[] args) {
        int[] arr = new int[]{120,50,200,550,700,850};
        int[] dep = new int[]{550,500,600,700,900,1000};
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform = 1;
        int max = 0;
        int i = 1;
        int j = 0;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            } else if(arr[i]>dep[j]){
                platform--;
                j++;
            }
            if(platform>max){
                max = platform;
            }
        }
        System.out.println(max);
    }
}
