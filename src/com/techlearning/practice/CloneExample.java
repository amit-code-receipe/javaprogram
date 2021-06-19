package src.com.techlearning.practice;

public class CloneExample {



    public static void main(String args[]) throws CloneNotSupportedException {
        Address ad=new Address("patna");
        Address ad2=new Address("Gaya");
        Employee emp=new Employee(1,"ram",ad);
        Employee emp2= (Employee) emp.clone();
        System.out.println(emp);
        System.out.println("before changing any value emp2 "+emp2);
        emp.setName("shyam");
        emp.setId(2);
        emp2.setAddress(ad2);
        System.out.println(emp);
        System.out.println("after changing name value in emp emp2 is "+emp2);
        emp2.setId(3);
        System.out.println(emp);
        System.out.println("after changing name value in emp emp2 is "+emp2);
    }
}

class Address {
    public Address(String city) {
        this.city = city;
    }

    public Address(){

    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String city;

}
class Employee implements Cloneable{
    int id;
    String name;
    Address address;
    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee() {
        super();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
