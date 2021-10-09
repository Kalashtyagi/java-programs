import java.util.Scanner;
public class Miles
{
 public static void main(String[] saiji)
{

  System.out.println("__________________________--"+ "\nConversion program km into miles...");
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter No. to change in kilometer: ");
  float km = sc.nextFloat();
    float Miles = 0.62f*km;
   System.out.print(km + " km =" + Miles + "miles");
}
}
   