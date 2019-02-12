import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    double age;

    public Employee(int id, String name, double age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee emp) {
        //let's sort the employee based on an age in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return ((int)this.age - (int)emp.age);
    }


}