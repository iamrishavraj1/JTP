package LinkedList;
import java.util.*;
public class DoublyLL {
    public static void main(String[] args) {
   Node head = new Node(10);
   Node n1 = new Node(20);
   Node n2 = new Node(30);
   head.next = n1;
   n1.prev = head;
   n1.next = n2;
   n2.prev = n1;
   print(head);
  
    }
    
    public static void print(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int x){
            data =x;
            next = null;
            prev = null;
        }
    }
}
