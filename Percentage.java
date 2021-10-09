import java.util.Scanner;
public class Percentage
{
  public static void main(String args[])
{
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your maths marks: ");
    int maths = scanner.nextInt();
    System.out.print("Enter your english marks: ");
   int eng = scanner.nextInt();
   System.out.print("Enter your c language marks: ");
    int c = scanner.nextInt();
    float Sum = maths+eng+c;
   
   float percentage = Sum/3;
  System.out.println("Your percentage is: " + percentage);
}
}
 