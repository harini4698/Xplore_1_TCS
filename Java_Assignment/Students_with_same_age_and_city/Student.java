public class Student{

    String name,city;
    double age;

    public Student(){
        name = "";
        age = 0.0;
        city = "";
    }

    public Student(String name, double age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
}