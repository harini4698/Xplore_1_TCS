public class Test{

    public static void main(String[] args){

        Employee e1 = new Employee(1, "aaa", 22);
        Employee e2 = new Employee(2, "bbb", 33);
        Employee e3 = new Employee(3, "ccc", 44);

        Employee res = getEmployeeWithMaxAge(e1, e2, e3);

        System.out.println(res.id + " " + res.name + " " + (int)res.age);
        
    }    


    public static Employee getEmployeeWithMaxAge(Employee e1, Employee e2, Employee e3) {

        Employee e4;
        e4 = e1.age > e2.age ? (e1.age > e3.age ? e1 : e3) : (e2.age > e3.age ? e2 : e3); 
        return e4;
    }


}