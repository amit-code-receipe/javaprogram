package src.com.techlearning.practice.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmployeeListDemo {

    public static void main(String args[]){
        List<Employee> emps= Arrays.asList(new Employee(4,"Ram",5000),
                new Employee(2,"Shyam",3000),new Employee(3,"Dev",6000));
        Collections.sort(emps);
        //remove operation not supported by Arrays.asList()
        //emps.remove(1);
       // System.out.println("index of obj" + emps.remove(1));
        System.out.println("ntural Order sorting" + emps);
        System.out.println("ntural Order sorting" + emps);

//        Collections.sort(emps, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.getSalary()>o2.getSalary()){
//                    return 1;
//                }
//                if(o1.getSalary()<o2.getSalary()){
//                    return -1;
//                }
//                return 0;
//            }
//        });

        System.out.println("custom Order sorting by salary" + emps);

        Collections.sort(emps, (o1,o2) ->{
                if(o1.getSalary()>o2.getSalary()){
                    return 1;
                }
                if(o1.getSalary()<o2.getSalary()){
                    return -1;
                }
                return 0;

        });

        System.out.println("custom Order sorting by salary" + emps);

        List<Employee>conList=new CopyOnWriteArrayList<>();
        conList.add(new Employee(1,"Dav",7000));
        conList.add(new Employee(5,"Res",4000));
        conList.add(new Employee(3,"Kedy",3000));
        //Iterable<Employee>its= (Iterable<Employee>) conList.iterator();
        Iterator<Employee>its= conList.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
            conList.remove(0);
            System.out.println(conList.size());
        }
    // does not allow remove for normal list while iterating
//        Iterator<Employee>empitr= emps.iterator();
//        while(empitr.hasNext()){
//            System.out.println(empitr.next());
//            emps.remove(0);
//            System.out.println(emps.size());
//        }

    }
}

class Employee implements Comparable{
    Integer id;
    String name;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;

//    @Override
//    public int compareTo(Employee o) {
//        return 0;
//    }

    // we can implement eith Comparable or Generic Comparable ,in generic compare ob type be of class type
    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
        if(this.id>emp.id){
            return 1;
        }
        if(this.id<emp.id){
            return -1;
        }
        return 0;
    }
}
