import java.util.Arrays;

public class Employee_sla{
    

    public static void main(String[] args){

        Employee[] e = new Employee[4];
        e[0] = new Employee(1, "aaa", 22);
        e[1] = new Employee(2, "bbb", 33);
        e[2] = new Employee(3, "ccc", 55);
        e[3] = new Employee(4, "ddd", 44); 
    
        /*Arrays.sort(e);

        for(int i = 0; i<4; i++){
            System.out.println(e[i].age);
        }*/
        Employee res = employeeWithSecondLowestAge(e);

        System.out.println(res.id + " " + res.name + " " + res.age);
        
    }

    public static Employee employeeWithSecondLowestAge(Employee[] e){
        Arrays.sort(e);
        return e[1];
    }

    

}