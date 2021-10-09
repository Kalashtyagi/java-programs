import java.util.Scanner;
public class Km
{
  public static void main(String[] args)
{
   System.out.print("Enter number for conversion: ");
   Scanner scanner = new Scanner(System.in);
   int no = scanner.nextInt();
   System.out.println("choose no: ");
   System.out.println("1.  In km");
   System.out.println("2 .  in m");
   int con = scanner.nextInt();
   if(con==1)
   {
     int km = no/1000;
     System.out.print(no + "m " + "=" + km + "km");
     
}
   else if(con==2)
{
    int m = no*1000;
   System.out.print(no + "km" + "=" + m + "m");
}
    
}
} 