package Searching;

public class InfinteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int x = 1;
        System.out.println(solution(arr,x));
    }
    //Naive Solution;
    static int solution(int[] arr,int x){
    int i = 0;
    while(true){
    if(arr[i]==x)
        return i;
    if(arr[i]>x)
        return -1;
    i++;
        
    }
    
    }
}
