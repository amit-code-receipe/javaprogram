package src.com.techlearning.practice.techlearning.practice.java8;

import java.util.Arrays;
import java.util.List;

public class Java8Demo {
    List<String> names= Arrays.asList("horse","lion");
   public static void main(String args[]){
       Java8Demo jd=new Java8Demo();
       jd.names.forEach(x->System.out.println(x));

       FunctionalInterfaceExample fex=new FunctionalInterfaceExample() {
           @Override
           public String nameOfAnimal(String name) {
               return null;
           }
       };
       fex.myName("test");

       FunctionalInterfaceExample.sum(3,4);

//       String str="hello";
//      FunctionalInterfaceExample fex=(ki)->{ return  ki; };
//    System.out.println(fex.nameOfAnimal("horse"));
   }
}
