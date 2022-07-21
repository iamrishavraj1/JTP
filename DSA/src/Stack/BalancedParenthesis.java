package Stack;
import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args) {
    
    }
    boolean matching(char a,char b){
        return ((a=='(' && b==')')|| (a=='{' && b=='}') || (a=='[' && b==']'));
    }
    
    boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            } else{
            
            }
        }
    }
}
