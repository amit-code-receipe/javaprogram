package src.com.techlearning.practice.randomprogram;

public class PrimaryNumberCheck {

    public static boolean isPrimary(int number){
        int i=2;
        while(i<=number/2){
            if(number%i==0){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String args []){
        System.out.println(" 12 is a primary no. ? "+ isPrimary(12));
        System.out.println(" 13 is a primary no. ? "+ isPrimary(13));
        System.out.println(" 15 is a primary no. ? "+ isPrimary(15));
        System.out.println(" 17 is a primary no. ? "+ isPrimary(17));
    }
}
