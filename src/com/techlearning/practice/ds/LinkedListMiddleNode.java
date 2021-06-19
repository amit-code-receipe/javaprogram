package src.com.techlearning.practice.ds;

public class LinkedListMiddleNode {
    Node head;
    public static Node getMiddleNode(Node head){
        if(null==head){
            return null;
        }
        Node trailing=head;
        while(head!=null){
            head=head.next;
            if(head!=null){
                head=head.next;
                trailing=trailing.next;
            }
        }
        return trailing;
    }

    public static boolean hasLoop(Node head){
        if(null==head){
            return false;
        }
        Node trailing=head;
        while(head!=null){
            head=head.next;
            if(head!=null){
                head=head.next;
                trailing=trailing.next;
            }
            if(head.data== trailing.data){
                return true;
            }
        }
        return false;
    }




    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
