package src.com.techlearning.practice.collection;

import java.util.*;

public class TwoMaxNumber {

    public static List<Integer> twoMaxNumbers(List<Integer> list){
        List<Integer> outlist= new ArrayList<>();
        int max1=0;
        int max2=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max1){
                max2=max1;
                max1=list.get(i);

            }
            if(max1!=list.get(i)&&list.get(i)>max2){
                max2= list.get(i);
            }
        }
        outlist.add(max1);
        outlist.add(max2);
        return outlist;
    }

    public static void main(String args[]){
        List<Integer>list1=Arrays.asList(9,9,4,5,6);
        Set<Integer>setInt=new HashSet<>(list1);
        setInt.add(null);
        setInt.add(null);
        List<Integer>list2=new ArrayList<>(setInt);
        list2.remove(null);
        Collections.sort(list2);
        Collections.reverse(list2);

        List<Integer>out=list2.subList(0,2);
        System.out.println(out);
        System.out.println(twoMaxNumbers(list1));
    }
}
