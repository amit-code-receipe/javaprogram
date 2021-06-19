package src.com.techlearning.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CopyAnArrayIntoAnother {
    ExecutorService ex=Executors.newFixedThreadPool(4);

//    public static void copyElements(int [] src,int[] dest){
//        for(int i=0;i<src.length;i++){
//            dest[i]=src[i];
//        }
//    }

    class Print implements Callable<String>{

        @Override
        public String call() throws Exception {
            return "Hello world";
        }
    }
    public static void main(String args[]){
        Map<String,String> mp=new HashMap<>();
        Map<String,String> treemp=new TreeMap<>();
        treemp.put("pine",null);
        treemp.put("orange","orange");
        treemp.put("apple","apple");
        for(Map.Entry<String,String>entry: treemp.entrySet()){
            System.out.println("key is"+entry.getKey());
            System.out.println("Value is"+entry.getValue());
        }

        mp.put(null,null);
        mp.put("orange","orange");
        mp.put("apple","apple");
        for(Map.Entry<String,String>entry: mp.entrySet()){
            System.out.println("Map for key is"+entry.getKey());
            System.out.println("Map for Value is"+entry.getValue());
        }
    }
}
