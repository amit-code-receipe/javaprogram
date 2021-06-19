package src.com.techlearning.practice.string;

public class CountCharInString {

    public static int countOfCharInString(String str){
        return str.toCharArray().length;
    }
    public static int countOfNonAlphabeticAndNumericCharInString(String  str){
        int count=0;
       for(char ch:str.toCharArray()){
           if(Character.isAlphabetic(ch)||Character.isDigit(ch)){
               count++;
           }
       }
       return count;
    }
    public static void countVowelAndConsonant(String str){
        char charr[]=new char[]{'a','e','i'};
        int vcount=0;
        int consCount=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)) {
                if (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                ||ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                    vcount++;
                } else {
                    consCount++;
                }
            }
        }
        System.out.println("vowel count "+vcount);
        System.out.println("consonant count "+consCount);
    }

    public static void main(String args[]){
        System.out.println("count of char in hello "+countOfCharInString("hello"));
        System.out.println("countOfNonAlphabeticAndNumericCharInString  "+countOfNonAlphabeticAndNumericCharInString("hel12@$#lo"));
        countVowelAndConsonant("Apple");
    }
}
