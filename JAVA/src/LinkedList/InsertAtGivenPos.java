package LinkedList;
import org.w3c.dom.Node;

import java.util.*;
public class InsertAtGivenPos {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int pos = in.nextInt();
    int ele = in.nextInt();
    Node head = null;
    head = insertPos(head,pos,10);
    head = insertPos(head,pos,20);
    head = insertPos(head,pos,30);
    head = insertPos(head,pos,40);
    printEle(head);
    head = insertPos(head,pos,ele);
    printEle(head);
    }
    
    public static void printEle(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static Node insertPos(Node head, int pos, int data){
        Node temp = new Node(data);
        if(pos==1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=1;i<=pos-2 && curr!= null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
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
