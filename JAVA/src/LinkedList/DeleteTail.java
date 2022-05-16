package LinkedList;
import org.w3c.dom.Node;

import java.util.*;
public class DeleteTail {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printListTail(head);
        System.out.println("Delete Tail in Process Start");
        head = deleteTail(head);
        printListTail(head);
        
    }
    
    static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next== null) return null;
        Node currEle = head;
        while(currEle.next.next != null){
            currEle = currEle.next;
        }
        currEle.next = null;
        return head;
    }
    public static void printListTail(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
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
