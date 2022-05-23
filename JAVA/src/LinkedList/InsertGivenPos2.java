package LinkedList;
import java.util.*;
public class InsertGivenPos2 {
    public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    print(head);
    insertEleRan(head,322,1);
    System.out.println("After Insert");
    print(head);
    }
    
    public static void insertEleRan(Node head,int data,int pos){
    Node isAdd = new Node(data);
    //if position == 0;
        if(pos==0){
            isAdd.next = head;
            head = isAdd;
        }
        Node prev = head;
        for(int i =0;i<pos-1;i++){
            prev = prev.next;
        }
        isAdd.next = prev.next;
        prev.next = isAdd;
    }
    
    public static void print(Node head){
       Node curr = head;
        while(curr!=null){
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
