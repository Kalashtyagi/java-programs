import java.util.Scanner;
import java.lang.Math.*;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape{
    public Square(int width){
        this.width = width;
    }

    public void area(){
        int area = this.width * this.width;
        System.out.println( "Area of square = " + area);
    }
}

class Circle extends Shape{
    public Circle(int width){
        this.width = width;
    }

    public void area(){
        System.out.println("Area of circle= " + (double)Math.PI * this.width * this.width);
    }
}

public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y to find area of square and circles: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}