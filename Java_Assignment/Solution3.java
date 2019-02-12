import java.util.Scanner;

public class Solution3{

    public static void main(String[] args){

        Area A = new Area();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        double height = sc.nextDouble(); 
        System.out.println("Enter length"); 
        double length = sc.nextDouble(); 
        System.out.println("Enter width"); 
        double width = sc.nextDouble(); 
        System.out.println(A.calculateArea(height, length, width));
    }
}