package src.com.techlearning.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPrograms {

    //reverse string
    public static String reverseString(String str){
        StringBuilder sb =new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseStringWithoutBuilder(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    // palidrome check
    public static boolean isPalidrome(String str){
        if(str==null){
            return false;
        }
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
            return true;
        }
        return false;
    }
    //permutation of String
    public static List<String> getStringPermutation(String str){
        List<String> permList= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            String str1="";
            for(int j=i;j<str.length();j++){
                str1=str1+Character.toString(str.charAt(j));
                permList.add(str1);
            }
        }
        for(String st:permList){
            System.out.println("perm str "+st);
        }
        return  permList;
    }
    //split string

    // count of words in a string
    public static void countWords(String str){
        String input[]=str.split(" ");
        Map<String,Integer> mp=new HashMap<>();
        for(String in:input){
            if(mp.get(in)!=null){
                mp.put(in,mp.get(in)+1);
            }else{
                mp.put(in,1);
            }
        }
        for(Map.Entry<String,Integer>entry: mp.entrySet()){
            System.out.println("Words is "+entry.getKey() +" its value is "+entry.getValue());
        }
    }
    //character counts in a string
    protected static void getCharacetrCount(String str){
        Map<Character,Integer>mp=new HashMap<>();
        for(Character ch:str.toCharArray()){
            if(mp.get(ch)!=null){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> mch:mp.entrySet()){
            System.out.println(" key :"+mch.getKey()+"  Value : "+mch.getValue());
        }
    }
    //read a file and count words
    public static void readWordCountinAFile(String path){
        Map<String,Integer>mp=new HashMap<>();
        File file=new File(path);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            while(true){
                try {
                    String str=br.readLine();
                    if (!(str!=null)) {
                        break;
                    }
                    String input[]=str.split(" ");
                    for(String in:input){
                        if(mp.get(in)!=null){
                            mp.put(in,mp.get(in)+1);
                        }else {
                            mp.put(in,1);
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String,Integer>entry: mp.entrySet()){
            System.out.println(" key : "+entry.getKey()+"  value : "+entry.getValue());
        }
    }

    public static void main(String args[]){
      String str= "Hello";
//      System.out.println("Reveresed string using builder "+reverseString(str));
//        System.out.println("Reveresed string without builder "+reverseStringWithoutBuilder(str));
//        System.out.println("Is string palindrome  "+isPalidrome(str));
//        System.out.println("Is string palindrome  "+isPalidrome("abba"));
//        System.out.println("Is string palindrome  "+isPalidrome("abcba"));
       // System.out.println( "get string perm "+getStringPermutation("abc"));
        //countWords("My name is Amit Amit is doing good");
        getCharacetrCount("AmitAmsd");
        StringPrograms strp=null;
        strp.getCharacetrCount("abcd");


    }
}
