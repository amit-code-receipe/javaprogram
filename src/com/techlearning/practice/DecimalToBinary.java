package src.com.techlearning.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class DecimalToBinary {
    public static void decimalToBinary(int num){
        Stack<Integer> stk=new Stack<>();
        int rem=0;
        while(num>0){

            rem=num%2;
            num=num/2;
            stk.push(rem);
            if(num==1){
                stk.push(1);
                break;
            }

        }
        if(stk.size()<4){
            stk.push(0);
        }
        int size=stk.size();
       for(int j=0;j<size;j++){
           System.out.print("  "+stk.pop()+" ");
       }
    }

    public static void main(String args[]){
     //   decimalToBinary(6);
        LinkedList<Integer> li=new LinkedList<>();
        li.add(3);
        li.add(-5);
        li.add(null);
        Comparator<Integer>ci= Collections.reverseOrder();
        Collections.sort(li,ci);
        for(int i:li){
            System.out.println(i);
        }
    }
}
