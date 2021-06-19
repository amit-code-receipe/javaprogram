package src.com.techlearning.practice.techlearning.practice.java8;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProgram {

    public static void main(String args[]) throws InterruptedException {
        System.out.println(OffsetDateTime.now());
        System.out.println(OffsetDateTime.now().toString());
        String s1=OffsetDateTime.now().toString();
        String s2=s1;
        Thread.sleep(2000);
        String s3=OffsetDateTime.now().toString();
        System.out.println(s3);
        String s1subs=s2.substring(s2.indexOf(":")+1,s2.indexOf(":")+3);
        String s3subs=s3.substring(s3.indexOf(":")+1,s3.indexOf(":")+3);
        System.out.println(s1subs);
        System.out.println(s3subs);
        int diff=Integer.parseInt(s3subs)-Integer.parseInt(s1subs);
        System.out.println(diff);
       // DateTimeFormatter df=new DateTimeFormatter.ofPattern("YYYY-mm-dd-hh:mm:ss");
        //String df="";
    }
}


