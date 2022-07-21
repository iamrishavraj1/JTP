package LinkedList;
import java.util.*;
public class DeleteEleLL {
    public static void main(String[] args) {
  Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(60);
    Node head = n1;
        head.next = n2;
        head.next.next = n3;
        head.next.next.next = null;
        System.out.println("BEFORE DELETE");
        traverse(head);
        deleteEle(head,2);
        System.out.println("AFTER DELETE");
      traverse(head);
    }
    
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    
    public static void deleteEle(Node head,int pos){
       if(pos==0){
           head = head.next;
       }
       Node prev = head;
        for (int i = 0; i <pos-1 ; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        
    }
}
