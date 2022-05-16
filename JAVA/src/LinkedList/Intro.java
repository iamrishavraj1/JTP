package LinkedList;
import org.w3c.dom.Node;

import java.util.*;
public class Intro {
    public static void main(String[] args) {
     
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next=temp2;
        Node copy = head;
        while(copy!=null){
            System.out.println(copy.data);
            copy = copy.next;
        }
    }
    private static   class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
    
}
