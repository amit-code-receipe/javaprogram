package src.com.techlearning.practice;

public class StaticCodeDemo {
    int i=5;
    String name;
    static int j;
    static class DemoStaticNested{
        static {
            System.out.println("I am part of static class");
            j=3;
            System.out.println("Accessing parent class variable in Nested static class" +j);
        }

        static {

            System.out.println("2nd static Accessing parent class variable in Nested static class" +j);
        }
    }
    // block scope can't acess outside of block
    //can't access non static variable
    static {
     //   int j;
        String name="hello";
        // need to initialse local variable before using
       // System.out.println("static block j"+j);---- compile time error
        j=2;
        System.out.println("static block j"+j);
        StaticCodeDemo std=new StaticCodeDemo();
        System.out.println("static block name"+name);
       // std.name="test";
        System.out.println("static block instance variable name "+std.name);
    }


    // block scope
    {
        int i=10;
        name="dummy";
        System.out.println("initial i"+i);
    }

    public static void main(String args[]){
        StaticCodeDemo std=new StaticCodeDemo();
        System.out.println(std.i);
        System.out.println(std.name);
       DemoStaticNested dms=new DemoStaticNested();
    }
}
