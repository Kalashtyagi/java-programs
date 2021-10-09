public class Method
{
   static void logic()
{
   System.out.println("bless");
}
   static int logic(int a, int b,int c)
{
   return a+b+c;
} 
   static int logic(int...arr)
{
 
int result=0;
for(int a:arr)
{
  result +=a;
}
   return result;
}
  static void logic(int x)
{
      x =67;
   System.out.println("hello world");
}
     static void arry(int[] arr)
{
     arr[0] = 98;
}
   public static void main(String[] args)
{
   System.out.println("Method call");

    int a = 4;
     logic(a);
    System.out.println(a);
    int[] mrks = {34,56,7,8};
    arry(mrks);
   System.out.println(mrks[0]);
   logic();
    System.out.println(logic(...arr:2,6,7,5,7));


}
}

