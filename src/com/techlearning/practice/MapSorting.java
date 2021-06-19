package src.com.techlearning.practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MapSorting {

    public   Map<String,String> getMap( List<Map<String, String>> collData ){
        Map<String,String> col= collData.stream().flatMap(m->m.entrySet().stream()).filter(i->i.getValue().equals("Course_1")).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        return col;
    }

    public static void main(String args[]){
        System.out.println("Global Payments Noida");
        List<Map<String, String>> collData = new ArrayList<>();
        // Map of student and course name
        Map<String, String> stuMap = new HashMap<String, String>();

        //Add map 1
        stuMap.put("Sanjeev", "Course_1");
        stuMap.put("Sanjay", "Course_2");
        stuMap.put("Sandeep", "Course_1");
        stuMap.put("Alex", "Course_2");
        stuMap.put("Dumbo", "Course_1");
        stuMap.put(null, "College_A");
        collData.add(stuMap);


        //Add map 2
        stuMap = new HashMap<String, String>();
        stuMap.put("Dave", "Course_1");
        stuMap.put("Alex", "Course_2");
        stuMap.put("Dumbo", "Course_1");
        stuMap.put("Rohan", "Course_2");
        stuMap.put("Rohit", "Course_1");
        stuMap.put(null, "College_B");
        collData.add(stuMap);
        // Find all those student/course pairs where Course=Course1
//       List<Map<String,String>> col= collData.stream().filter(s->
//            s.entrySet().stream().
//                    filter(e->e.getValue().equals("Course_1"))).collect(Collectors.toList());

//        Map<String,String> col2= collData.stream().filter(f->f.entrySet().stream().filter(e->e.getValue().equals("Couse_1")))
//                .collect(Collectors.toMap(e->e.g)));
        Map<String,String> col=new HashMap<>();

        for(Map<String,String>mp:collData){
            for(Map.Entry<String,String>entry:mp.entrySet()){
                if(entry.getValue().equals("Course_1")){
                    col.put(entry.getKey(), entry.getValue());
                }
            }
        }


        System.out.println(col);
        System.out.println(col.size());

        List<String> arr=new ArrayList<>();
        arr.add("hello");
       arr.add("welcome");
       String arr1[]=arr.stream().toArray(String[]::new);
       System.out.println(arr1.length);

    }
}
