package src.com.techlearning.practice.techlearning.practice.java8;
@FunctionalInterface
public interface FunctionalInterfaceExample {
    public String nameOfAnimal(String name);
    public default void myName(String str){
        System.out.println("My name is "+str);
    }

    public default void testhello(String str){
        System.out.println("My name is "+str);
    }

    public static void sum(int a1,int a2){
        int sum=a1+a2;
        System.out.println("sum is "+sum);
    }
}
