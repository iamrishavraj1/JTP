package LinkedList;
import java.util.*;
public class DeleteFirstEle {
    public static void main(String[] args) {
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       printListAll(head);
       System.out.println("Delete Process Start");
       head = deleteElem(head);
       printListAll(head);
    }
    
  static Node deleteElem(Node head){
       if(head==null){
           return null;
       } else{
           return head.next;
       }
  }
  
  public static void printListAll(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
  }
    private static class Node {
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
}
