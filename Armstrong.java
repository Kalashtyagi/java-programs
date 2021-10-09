import java.util.Scanner;
public class Armstrong
{
  public static void main(String[] args)
{
  //Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Number to check armstrong or not: ");
  int no = sc.nextInt();
  int t1=no;
  int leng = 0;
  while(t1!=0)
{
  leng = leng + 1;
  t1= t1/10;
}
    int t2 = no, arm = 0;
   while(t2!=0)
{
    int  mul = 1,rem=0;
   rem  = t2%10;
   for(int i=1;i<=leng;i++)
{
    mul=mul*rem;
}
  arm = arm + mul;
  t2=t2/10;
   
}
  if(arm==no)
{
    System.out.println(no + " is armstrong");
}
  else 
{
    System.out.println(no + " is not armstrong number");
}
}
}
  
 