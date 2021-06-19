package src.com.techlearning.practice;

public class LinkedListProgram {
    Node head;
    public LinkedListProgram(){
        this.head=null;
    }
    static class Node {
        int value;
        Node next;

        public Node(int value){
            this.next=null;
            this.value=value;
        }
    }

    public Node addNode(int data){
        Node tmp=this.head;
        if(this.head==null){
            tmp=new Node(data);

        }else{
            while(tmp!=null){
                tmp=tmp.next;
            }
            tmp=new Node(data);
        }
        return tmp;
    }

    public void deleteNode(Node nd){
        Node tmp=head;
        Node prev=null;
        if(nd==null){
            return;
        }
        if(this.head.value== nd.value){
            head=head.next;
        }
        while(tmp!=null){
            if(tmp.value==nd.value){
               prev.next=tmp.next;
                break;
            }
            prev=tmp;
            tmp=tmp.next;
        }
    }

    public void traverseNode(){
        Node tmp=head;
        if(this.head==null){
            return;
        }
        while(tmp!=null){
            System.out.println(tmp.value);
            tmp=tmp.next;
        }
    }

    public Node reverse(Node nd){
        Node prev=null;
        Node current=nd;
        Node next=null;
        while (current!=null){
             next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        nd=prev;
        return nd;
    }

    public boolean hasLoop(){
        Node slow=head;
        Node fast=head;
        while(slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.value==fast.value){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        LinkedListProgram lp=new LinkedListProgram();
        lp.head=lp.addNode(5);
        lp.head.next=lp.addNode(6);
        lp.head.next.next=lp.addNode(7);
        lp.traverseNode();
        Node n1=new Node(6);
      //  lp.deleteNode(n1);
      //  lp.traverseNode();
        lp.head=lp.reverse(lp.head);
        lp.traverseNode();
    }
}
