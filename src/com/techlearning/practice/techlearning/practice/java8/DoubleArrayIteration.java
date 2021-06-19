package src.com.techlearning.practice.techlearning.practice.java8;

import java.util.Random;

public class DoubleArrayIteration {
static char[] getCharsout(int N,String[] str,int Q,int[][] arr){
    char[] out=new char[Q];
    int k=0,m=0,l=0;
    String fin=null;
    for(int i=0;i<Q;i++){
        fin="";
        k=arr[i][0];
        l=arr[i][1];
        m=arr[i][2];

        if(k==l){
            fin=str[k-1];
        }else{
            while(k<=l){
                fin+=str[k-1];
                k++;
            }
        }
        out[i]=fin.charAt(m);
    }

    return out;
}
    public static void main(String args[]){
//        int [][]arr=new int[3][3];
//        String []strarr=new String[3];
//        strarr[0]="aaaa";
//        strarr[1]="bbbb";
//        strarr[2]="cccc";
//        arr[0][0]=2;
//        arr[0][1]=2;
//        arr[0][2]=3;
//
//        arr[1][0]=1;
//        arr[1][1]=2;
//        arr[1][2]=4;
//
//        arr[2][0]=2;
//        arr[2][1]=3;
//        arr[2][2]=5;
//       char[]out= getCharsout(3,strarr,3,arr);

//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
//        for(int i=0;i< out.length;i++){
//
//            System.out.println(out[i]);
//        }
//        System.out.println(arr.length);

Integer i1=new Integer(3);
Integer i2=new Integer(3);
        System.out.println(i1==i2);

        System.out.println(i1.equals(i2));

    }
}

