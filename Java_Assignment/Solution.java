public class Solution{

    public static void SwapName(Employee e1, Employee e2){
        String temp;
        temp = e1.name;
        e1.name = e2.name;
        e2.name = temp;
    }

    public static void main(String[] args){

        Employee e1 = new Employee(1, "aaa");
        Employee e2 = new Employee(2, "bbb");

        SwapName(e1, e2);

        System.out.println(e1.name + " " + e2.name);
    }
}