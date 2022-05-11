package Searching;
import java.util.*;
public class Squareroot {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int low = 1;
        System.out.println(solution(number,low, number));
    }
    //Naive Solution
//    static int solution(int x){
//    int i = 1;
//    while(i*i<=x){
//        i++;
//    }
//    return i-1;
//    }
    
    static int solution(int x,int low,int high){
        low = 1;
        high = x;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int midSq = mid * mid;
            if(midSq==x){
                return mid;
            }
            else if(midSq>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                ans = mid;
            }
        }
       return ans;
        
    }
}
