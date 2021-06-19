package src.com.techlearning.practice.techlearning.practice.java8;

import src.com.techlearning.practice.AddressInfo;
import src.com.techlearning.practice.DisttrictInfo;

import java.io.*;

public class SerializableDemo {

    public static void main(String args[]){
        AddressInfo addressInfo=new AddressInfo();
        addressInfo.setCity("patna");
        addressInfo.setName("patna city");
        addressInfo.setPostalCode(1234);
        addressInfo.setId(15);
        System.out.println("befor serialization" +addressInfo);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Amit\\IdeaProjects\\javaproject\\javaprogram\\test.ser")));
                oos.writeObject(addressInfo);
                oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Amit\\IdeaProjects\\javaproject\\javaprogram\\test.ser")));
           AddressInfo info= (AddressInfo) ois.readObject();
           System.out.println("after deserialization" +info);
            System.out.println("after deserialization static " +info.getId());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        DisttrictInfo disttrictInfo=new DisttrictInfo();
        disttrictInfo.setCity("patna");
        disttrictInfo.setName("patna city");
        disttrictInfo.setPostalCode(1234);
        disttrictInfo.setDistCode(678);
        disttrictInfo.setDistName("begusrai");
        disttrictInfo.setId(15);
        System.out.println("befor serialization" +disttrictInfo);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Amit\\IdeaProjects\\javaproject\\javaprogram\\dist.ser")));
            oos.writeObject(disttrictInfo);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Amit\\IdeaProjects\\javaproject\\javaprogram\\dist.ser")));
            DisttrictInfo info= (DisttrictInfo) ois.readObject();
            System.out.println("after deserialization" +info);
            System.out.println("after deserialization static " +info.getId());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

