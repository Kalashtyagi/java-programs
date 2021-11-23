import java.util.Scanner;

public class BinaryConverter{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Integer to convert it into binary: ");
   int x= sc.nextInt();
   System.out.println(Converter.toBinary(x));
}
}
  public class Converter
{
  public static String toBinary(int num)
{
   String binary = "";
   while(num>0)
{
   binary = (num % 2) + binary;
   num/=2;
}
  return binary;
}
}