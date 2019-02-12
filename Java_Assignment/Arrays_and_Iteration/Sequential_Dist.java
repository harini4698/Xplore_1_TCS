
import java.lang.Math; 
public class Sequential_Dist{

    public static void main(String[] args){

        Point[] p = new Point[4];

        p[0] = new Point(-3, -4);
        p[1] = new Point(0, 0);
        p[2] = new Point(4, 3);
        p[3] = new Point(16, 2);

        findSequentialDistance(p);

    }

    public static void findSequentialDistance (Point[] p){

        double sqr,sum = 0;

        for(int i = 0; i<=2; i++){
            sqr = Math.pow(p[i+1].getY() - p[i].getY(), 2) + Math.pow(p[i+1].getX() - p[i].getX(), 2);
            sum += Math.sqrt(sqr);
        }

        System.out.println(Math.ceil(sum));
    }
}