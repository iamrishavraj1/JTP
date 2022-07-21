package Stack;
import java.util.*;
public class LinkedListImplement {
    public static void main(String[] args) {
    
    }
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next=null;
        }
    }
    
    class MyStack{
        Node head;
        int sz;
        MyStack(){
            head = null;
            sz = 0;
        }
        int size(){
            return sz;
        }
        boolean isEmpty(){
            return (head==null);
        }
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head=temp;
            sz++;
        }
        int pop(){
            if(head==null){
                return Integer.MAX_VALUE;
                
            }
            int res = head.data;
            head = head.next;
            sz--;
            return res;
        }
        
        int peek(){
            if(head==null){
                return Integer.MAX_VALUE;
            }
            return head.data;
        }
    }
}
