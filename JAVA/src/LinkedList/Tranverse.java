package LinkedList;
import java.util.*;
public class Tranverse {
    public static void main(String[] args) {
    Node temp = new Node(10);
    temp.next = new Node(20);
    temp.next.next = new Node(30);
    temp.next.next.next = new Node(40);
    printList(temp);
    }

    public static void printList(Node temp) {
    Node curr = temp;
    while(curr!=null){
        System.out.println(curr.data + " ");
        curr=curr.next;
    }
    }
    
 private static   class Node {
        int data;
     Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
}
