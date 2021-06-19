package src.com.techlearning.practice.techlearning.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManipulation {
    List<Employee> empList= Arrays.asList(
            new Employee(1,200,"ram"),
            new Employee(2,100,"tom"),
            new Employee(3,300,"jerry"),
            new Employee(4,600,"paul"),
            new Employee(5,400,"aron")
    );
    //display each employee data sorted by salary
    public void displaySortBySalary(List<Employee>employees){
       employees= empList.stream().sorted((emp1,emp2)->{return emp1.getSalary()-emp2.getSalary();}).collect(Collectors.toList());
       employees.forEach(emp->System.out.println(emp.toString()));
    }

    public void displaySortByName(List<Employee>employees){
        employees= empList.stream().sorted((emp1,emp2)->{return emp1.getName().compareTo(emp2.getName());}).collect(Collectors.toList());
        employees.forEach(emp->System.out.println(emp.toString()));
    }


    public static void main(String args[]){
        EmployeeManipulation emps=new EmployeeManipulation();
       // emps.displaySortBySalary(emps.empList);
      //  emps.displaySortByName(emps.empList);
       long count= emps.empList.stream().map(emp->emp.getSalary()).count();
       Optional<Integer> min= emps.empList.stream().map(emp->emp.getSalary()).min((i1, i2)->{return i1-i2;});
       System.out.println(count);
        System.out.println(min.isPresent()?min.orElse(7):min.get());

        emps.empList.stream().mapToLong(em->em.getSalary()).forEach(x->System.out.println(x));
    }
}
