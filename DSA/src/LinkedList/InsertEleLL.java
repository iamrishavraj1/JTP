package LinkedList;
import java.util.*;
public class InsertEleLL {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        head.next.next = n3;
        head.next.next.next = null;
        System.out.println("BEFORE INSERT");
        print(head);
        Insert(head,40,2);
        System.out.println("AFTER INSERT");
        print(head);
        
    }
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    
    
    public static void Insert(Node head,int data,int pos) {
        Node ele = new Node(data);
         if(pos==0){
            ele.next = head;
            head = ele;
        }
        Node prev = head;
         for (int i = 0; i < pos-1; i++) {
            prev = prev.next;
         }
        ele.next = prev.next;
        prev.next = ele;
    }
    
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    
    
    
}
