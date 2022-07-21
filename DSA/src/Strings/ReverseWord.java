package Strings;
import java.util.*;
public class ReverseWord {
    public static void main(String[] args){
       String str = "Welcome to Gfg";
       char[] strA = str.toCharArray();
       int n = str.length();
      reverseWords(strA,n);
        System.out.println(strA);
    }
    public static void reverse(char str[],int low,int high){
    while(low<=high){
        char temp = str[low];
        str[low]=str[high];
        str[high]= temp;
        low++;
        high--;
    }
    }
    public static void reverseWords(char str[],int n){
    int start = 0;
    for(int end = 0;end<n;end++){
        if (str[end]==' '){
            reverse(str,start,end-1);
            start=end+1;
        }
        
    }
    
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
}
