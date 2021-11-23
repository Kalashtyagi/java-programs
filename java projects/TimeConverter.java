import java.util.Scanner;
public class TimeConverter
{
  public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Days to convert it into Seconds: ");
    int days = sc.nextInt();
    int sec = days*24*60*60;
    System.out.println(days + " days" + " = " + sec + " seconds");
}
}