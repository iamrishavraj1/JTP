package LinkedList;
import org.w3c.dom.Node;

import java.util.*;
public class CircularLinkList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(202);
        head.next.next.next = new Node(120);
        head.next.next.next.next = head;
//        Node temp1 = new Node(20);
//        Node temp2 = new Node(30);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = head;
        print(head);
    }
    
    public static void print(Node head){
        if(head==null){
            return;
        }
        Node r = head;
        do{
            System.out.println(r.data + "");
            r = r.next;
        } while (r!=head);
//        System.out.println(head.data + " ");
//        for(Node r = head.next;r!=head;r=r.next){
//            System.out.println(r.data + " ");
//        }
    }
    public static Node insertB(Node head,int data){
       Node temp = new Node(data);
       Node curr = head;
       if(head==null){
           temp.next = temp;
       } else{
           while(curr!=head){
               curr = curr.next;
           }
           curr.next = temp;
           temp.next = head;
       }
       return temp;
        
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
