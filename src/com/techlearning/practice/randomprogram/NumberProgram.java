package src.com.techlearning.practice.randomprogram;

public class NumberProgram {
    //sum of all digits
    public static int sumOfzdigits(int number) throws Exception {
        if(number<0){
            throw new Exception("Number should be greater than zero");
        }
        int sum=0;
        while(number>0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }
    //num is even or odd
    public static String oddOrEvenNumber(int number) throws Exception {
        if(number<0){
            throw new Exception("number should be greater than zero");
        }
        if(number==1){
            return "neiher even or odd";
        }
        if(number%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
    //reverse the number
    public static int reverseNumber(int number){
        int reversednum=0;
        while(number>0){
            reversednum=reversednum*10+number%10;
            number=number/10;
        }
        return reversednum;
    }
    //odd digit number divisible by 2
    public static boolean isOddDigitDivisibleByTwo(int number){
        // 1456 -46 -  divisible by 2- first two digit check if its even or odd
        if((number%10)%2==0){
            return true;
        }
        return false;
    }

    // club number into group of two consecutive digit in  an array
    public static void main(String args[]) throws Exception {
        System.out.println("sum of 123456 is "+ sumOfzdigits(123456));
        System.out.println("sum of 7 is "+ sumOfzdigits(7));
       // System.out.println("sum of -87 is "+ sumOfzdigits(-87));
        System.out.println("Reverse of 123456 is "+ reverseNumber(123456));
        System.out.println("Reverse of 7 is "+ reverseNumber(7));
    }
}
