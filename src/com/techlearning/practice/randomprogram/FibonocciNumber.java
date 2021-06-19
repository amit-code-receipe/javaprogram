package src.com.techlearning.practice.randomprogram;

import java.util.ArrayList;
import java.util.List;

public class FibonocciNumber {

    public static int[] getFibonocci(int num){
        int fib=0;

        int fibarr[]=new int[3];
        fibarr[0]=1;
        fibarr[1]=1;
        for(int i=2;i<num;i++){
            fibarr[i]=fibarr[i-1]+fibarr[i-2];
        }
        for(int i:fibarr) {
            System.out.print(i+",");
        }
        return fibarr;
    }

    public static void getFibrec(int num){
    int t1=0,t2=1,i=0;
    while(i<num){
        System.out.print(""+t1+",");
        t1=t2;

        t2=t1+t2;
        i++;
    }



    }
    public static int getFibnocciOfNthNum(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        if(num>1){
            List<Integer> fibs=new ArrayList<>();
            fibs.add(0);
            fibs.add(1);
//          num= num-2;
          int ct=2;
           while(ct<=num){
               fibs.add(fibs.get(ct-1)+fibs.get(ct-2));
               ct++;
           }
           return fibs.get(num);
        }
        return 0;
    }

    public static void main(String args[]){
//        System.out.println("fib 1 "+getFibonocci(1));
//        System.out.println("fib 2 "+getFibonocci(2));
//        System.out.println("fib 3 "+getFibonocci(3));
        System.out.println("fib 1 "+getFibnocciOfNthNum(1));
        System.out.println("fib 2 "+getFibnocciOfNthNum(2));
        System.out.println("fib 3 "+getFibnocciOfNthNum(5));
    }
}
