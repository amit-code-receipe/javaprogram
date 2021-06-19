package src.com.techlearning.practice;

import java.io.Serializable;
import java.util.Objects;
//parent class must have no arg constructor if we are implementing serializable for childclass
//if parent implements serializable then child class automatically gets serialized
public class AddressInfo extends Address implements Serializable {
    private static  final long serialVersionUID= 32L;
    String city;
    //after deserialization its value will be set as default value for String that's null
    transient String name;
    // static variable does not serialize and desiarlize, it belongs to class ,its value will be same which was last assigned or modified so its 10
    static int id=10;
    int postalCode;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressInfo that = (AddressInfo) o;
        return postalCode == that.postalCode &&
                Objects.equals(city, that.city) &&
                Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public AddressInfo() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, name, postalCode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        AddressInfo.id = id;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
