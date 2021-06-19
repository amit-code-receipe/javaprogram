package src.com.techlearning.practice.techlearning.practice.java8;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class BigFileProcessing {
    Node root;
    Set<String> st=new HashSet<>();
    int size;

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public Node addNode(Node node,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        while (root!=null){
            if(root.data==data){
                return root;
            }
            if(root.data>data){
               return addNode(root.left,data);
            }
            if(root.data<data){
              return   addNode(root.right,data);
            }
        }
        return null;
    }
     class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String args[]) throws IOException {
        String filepath="D://nontechstudy//currentStaticNotes//Miscellaneous.docx";
      //  File f=new File(filepath);
       // System.out.println("file size"+f.length());

      //  Files.lines(Paths.get(filepath)).filter(line->line.contains("Gujarat")).forEach(System.out::println);
    }
}
