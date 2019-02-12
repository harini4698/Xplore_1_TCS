public class Solution{

    public static void main(String[] args){

        Student e1 = new Student("aaa", 15, "mumbai");
        Student e2 = new Student("bbb", 15, "mumbai");
        Student e3 = new Student("ccc", 17, "mumbai");

        int res = studentCountWithSameCityAndAge(e1, e2, e3);
        System.out.println(res);
    }

    public static int studentCountWithSameCityAndAge(Student e1, Student e2, Student e3){

        if((e1.age == e2.age && e1.city == e2.city) && (e2.age == e3.age && e2.city == e3.city)){
            return 3;
        }else if((e1.age == e2.age && e1.city == e2.city) || (e2.age == e3.age && e2.city == e3.city) || (e1.age == e3.age && e1.city == e3.city)){
            return 2;
        }else{
            return 1;
        }
    }
}