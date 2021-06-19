package src.com.techlearning.practice.randomprogram;

public class StringPrograms {

    //reverse string
    public static String reversedString(String input){
        String reversed="";
        int i=input.length()-1;
        while(i>=0){
            reversed=reversed+input.charAt(i);
            i--;
        }
        return reversed;
    }
    //palindrome check
    public static boolean isPalindrome(String input,String word){
        return (orderStringInAsc(input).equals(orderStringInAsc(word)));

    }
    public static String orderStringInAsc(String in){
       char[] ch= in.toCharArray();
       for(int i=0;i<ch.length;i++){
           for(int j=i+1;j<ch.length;j++){
               if(ch[i]>ch[j]){
                   char tmp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=tmp;
               }
           }
       }
       return  new String(ch);
    }
    // all substring

    //find a given string in another string

    public static void main(String args[]){
        System.out.println("Reverse of Time is  "+reversedString("Time"));
        System.out.println("Reverse of Amit is  "+reversedString("Amit"));

        System.out.println("Amit is palindrome of imAt  "+isPalindrome("Amit","imAt"));
        System.out.println("abcde is palindrome of cdeba  "+isPalindrome("abcde","cdeba"));
        System.out.println("abcde is palindrome of cdaeba  "+isPalindrome("abcde","cdeaba"));
    }

}
