package src.com.techlearning.practice;
abstract class Fe{
    public Fe(){
        System.out.println("I am Fe");
    }
}
interface Test{
   public  static void Test(){

    }
}
class A extends Fe{
    int id;
    String name;
    public A(){
        System.out.println("I am A constructor");
    }
    void play(){
        System.out.println("I am A");
    }
}

class B extends A{
    int id;
    String name;
    public B(){
        System.out.println("I am B constructor");
    }
    void play(){
        System.out.println("I am B");
    }
    void dance(){
        System.out.println("B is dancing");
    }
}

class C extends B{
    int id;
   public C(){
       System.out.println("I am C constructor");
    }
    public C(int i){
        System.out.println("I am C parameter constructor");
        id=i;
    }
    // it can't throw ompile time exception if parent method is not throwing that exception
    void dance() throws  RuntimeException{
        System.out.println("C is dancing");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[]){
        // default constuctor will call parent first , C will call B ,B to A
        A a1=new C();
        // parametrized constructor of hild class also calls all top level default constr of parent
        C a2=new C(5);
        a2.dance();
        a1.play();
        a1.id=1;
        a1.name="A!";
        // parent object can be assigned to child reference,after casting it will not throw compile
        //error but at run time it will throw exception
       // B b1= (B) new A();
       // b1.play();
    }

}
