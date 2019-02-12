public class Area{

    double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    double calculateArea(double length, double width){
        return length*width;
    }

    double calculateArea(double height, double length, double width){
        return length*width*height;
    }
}