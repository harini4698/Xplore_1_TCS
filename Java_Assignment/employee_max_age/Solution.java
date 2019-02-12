public class Solution{

    public static void main(String[] args){

        Employee e1 = new Employee(1, "aaa", 22);
        Employee e2 = new Employee(2, "bbb", 33);
        Employee e3 = new Employee(3, "ccc", 44);

        int res = getEmployeeWithMaxAge(e1, e2, e3);
        
        if(res == 1){
            System.out.println(e1.id + " " + e1.name + " " + (int)e1.age);
        }else if(res == 2){
            System.out.println(e2.id + " " + e2.name + " " + (int)e2.age);
        }else{
            System.out.println(e3.id + " " + e3.name + " " + (int)e3.age);
        }
    }    


    public static int getEmployeeWithMaxAge(Employee e1, Employee e2, Employee e3) {

        if(e1.age > e2.age){
            if(e1.age > e3.age){
                return 1;
            }else{
                return 3;
            }
        }else{
            if(e2.age > e3.age){
                return 2;
            }else{
                return 3;
            }
        }
    }


}