package src.com.techlearning.practice;

public class WelcomeToJava {
    static int i;
    byte b;
    short s;
   final  long l;
    float f;
    double d;
    char ch;
    {
        System.out.println("initialize block  " );
        l=10;
        System.out.println("initialize block  " +l);
      //  WelcomeToJava wje=new WelcomeToJava();
    }

    public WelcomeToJava(){
       // l=12;
        System.out.println("in constructor");
    }
    static void test(){
        System.out.println("static method call with null obj without null pointer");
    }
    static {
        System.out.println("in static block ");

    }

    public static void main(String args[]){
        // static block will be called first
        // when object is getting created then initialization block will be called after tat constructor

        System.out.println(i);
       // System.out.println(b);
        WelcomeToJava wj=new WelcomeToJava();
        wj=null;
        // static method can be called even with null obj since static is class level property
        wj.test();
      //  wj.toString();-- it will throw null pointer
    }
}
