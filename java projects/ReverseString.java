import java.util.Scanner;
public class ReverseString
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter any text: ");
   String text = sc.nextLine();
   char[] arr = text.toCharArray();
   int l = arr.length;
   for(int i=l-1;i>=0;i--)
{
   System.out.print(arr[i]);
}
}
}
