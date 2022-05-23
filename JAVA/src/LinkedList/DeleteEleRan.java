package LinkedList;
import org.w3c.dom.Node;

import java.util.*;
public class DeleteEleRan {
    public static void main(String[] args) {
    Node head = new Node(20);
    head.next = new Node(22);
    head.next.next = new Node(33);
    head.next.next.next = new Node(331);
    print(head);
    System.out.println("After Delete");
    del(head,0);
    print(head);
    }
    
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static void del(Node head, int pos){
        if(pos==0){
            head = head.next;
            return;
          
        }
        Node prev = head;
        for(int i =0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    
    private static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
}
