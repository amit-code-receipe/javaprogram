package src.com.techlearning.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StringManipulation {

    public void sortCharacter(String str) {
        System.out.println(String.format("string size %s", str.length()));
        char[] ch = str.toCharArray();
        System.out.println("size f list"+ Arrays.asList(ch).size());
        Arrays.asList(ch).forEach(System.out::println);
        Arrays.sort(ch);
        Arrays.asList(ch).forEach(System.out::println);
      String st=  str.replace('h','m');
      System.out.println("replaced "+ st);
        System.out.println("contains pr "+ str.contains("mr"));
    }

    public void reverse(String str){
        Stack<Character> st=new Stack<>();
        for(Character ch:str.toCharArray()){
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder(str);
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println("reverse string is "+sb.toString());
        System.out.println("reverse string is "+sb1.reverse().toString());
    }

    public String reverserecursive(String str){
        String st="";
        if(str==null ||str.length()<=1) {
            return str ;
        }

        return str.charAt(str.length()-1)+reverserecursive(str.substring(0,str.length()-1));

    }

    public static void main(String args[]){
        StringManipulation sm=new StringManipulation();
     //   sm.sortCharacter("hello world");
        System.out.println("hell".startsWith("h"));
        System.out.println( "Apple".replace("ppl","3"));
      //  sm.reverse("Hello world");
      // System.out.println( sm.reverserecursive("Hello"));
        List<Integer> intlist=Arrays.asList(3,4,5,7,11,9);
       List<Integer> immut=Collections.unmodifiableList(intlist);
       //we can't modify immutable list, can' add, remove,sort
     //  immut.add(9);
     //   immut.remove(5);
       Collections.sort(intlist);
       System.out.println(immut);
    }
}
