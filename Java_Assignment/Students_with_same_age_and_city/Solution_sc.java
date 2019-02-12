import java.util.Scanner;

public class Solution_sc{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name, city;
        double age;

        Student e[] = new Student[7];

        for(int i = 0; i<=2; i++){
            name = sc.next();
            age = sc.nextDouble();
            city = sc.next();
            e[i] = new Student(name, age, city);
        }
        int res = studentCountWithSameCityAndAge(e[0], e[1], e[2]);
        System.out.println(res);
    }

    public static int studentCountWithSameCityAndAge(Student e1, Student e2, Student e3){

        

        if((e1.city.equals(e2.city) && e2.city.equals(e3.city)) && (e1.age == e2.age && e2.age == e3.age))
            return 3;
        else if(e1.city.equals(e2.city) && e1.age == e2.age || e2.city.equals(e3.city) && e2.age == e3.age || e1.city.equals(e3.city) && e1.age == e3.age)  
                return 2;
             else
                return 0; 

            
    }
}