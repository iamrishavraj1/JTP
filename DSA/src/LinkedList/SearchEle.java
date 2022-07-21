package LinkedList;
import java.util.*;
public class SearchEle {
    public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);
    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = null;
    System.out.println(search(head,30,0));
    }
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    
    public static int search(Node head,int ele,int pos){
        Node curr = head;
        while (curr!=null){
            if (curr.data==ele){
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
