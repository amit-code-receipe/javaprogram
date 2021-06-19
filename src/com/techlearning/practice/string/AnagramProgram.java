package src.com.techlearning.practice.string;

public class AnagramProgram {

    public static void checkStringAreAnagram(String str1,String str2){
        if(str1.length()!= str1.length()){
            System.out.println("not an anagram");
            return;
        }
        for(int i=0;i<str1.length();i++){
            if(str2.indexOf(str1.charAt(i))==-1){
                System.out.println("not an anagram");
                return;
            }else{
                str2=str2.substring(i,str2.indexOf(str1.charAt(i)))+
                        str2.substring(str2.indexOf(str1.charAt(i))+1,str2.length());
            }
        }
        System.out.println("String is angram");
    }

    public static boolean anagramCheck(String str1,String str2){
        for(int i=0;i<str1.length();i++){
                if(str2.indexOf(str1.charAt(i))==-1){
                    return false;
                }else{
                    str2.replace(str2.charAt(str2.indexOf(str1.charAt(i))),' ');
                }
            }

        return  true;
    }

    public static void main(String args[]){
        System.out.println("is anagram Apple and Alepp"+ anagramCheck("apple","alepp"));
        System.out.println("is anagram hello and Alepp"+ anagramCheck("hello","alepp"));
    }
}
