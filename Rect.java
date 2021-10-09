import java.util.Scanner;
class Rectangle{
    int l,b;
 
     public int area()
{
   return l*b;
}
  public int perimeter()
{
  return 2*(l+b);
}
}

public class Rect
{
  public static void  main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Area and perimeter of rectangle...\n");
   System.out.print("Enter lenght of rectangle: ");
     int l = sc.nextInt();
   System.out.print("Enter Breadth of rectangle: ");
    int b = sc.nextInt();
    Rectangle rec = new Rectangle();
    rec.l=l;
    rec.b=b;
    System.out.println("The Area of rectangle= " + rec.area());
    System.out.print("\nThe Perimeter of rectangle= " + rec.perimeter());
}
}
   