import util.java.Scanner;
class PrimeNo
{
 public static void main(String[] args)
{
   Scanner scanner = new Scanner(System.in)
   
   int no = scanner.nextInt();
   for(int i=2;i<=no-1;i++)
{
   if(no%i==0)
{
  temp = temp+1;
}
 }
if(temp==0)
{ 
  System.out.println(no + "is a prime no");
}
 else 
{
 System.out.println(no + "is not prime");
}
}
}