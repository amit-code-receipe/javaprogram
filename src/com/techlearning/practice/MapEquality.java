package src.com.techlearning.practice;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.HashMap;
import java.util.Map;

public class MapEquality {

    public static boolean mapEquality(Map<String,String> first,Map<String,String> sec){
        if(first.equals(sec)) {
            return true;
        }
        return  false;
    }

    public static void main(String args[]){
        Map<String,String> map1= new HashMap<>();
        map1.put("ram","test");
        map1.put("dinu","test1");
        map1.put("shyam","test2");
        map1.put("monto","test3");
        Map<String,String> map2= new HashMap<>();
        map2.put("dinu","test1");
        map2.put("shyam","test2");
        map2.put("ram","test");

      //  map2.put("monto","test3");
        System.out.println(mapEquality(map1,map2));
    }
}


