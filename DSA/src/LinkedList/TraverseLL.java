package LinkedList;
import java.util.*;
public class TraverseLL {
    public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node head = n1;
    head.next = n2;
    head.next.next = n3;
    head.next.next.next = n4;
    head.next.next.next.next = null;
    traverse(head);
    }
    
  public static class Node{
        int data;
       Node next;
        Node(int x){
            data =x;
            next = null;
        }
    }
    public static void traverse(Node head){
    Node curr = head;
    while (curr!=null){
        System.out.println(curr.data);
        curr = curr.next;
    }
    }
}
