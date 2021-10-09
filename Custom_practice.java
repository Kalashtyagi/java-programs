

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
   class routine{
        public void wakeup()
{
  System.out.println("I wake up at 4 o'clock daily");
}
  public void breakfast(){
    System.out.println("have at 8 o'clock");}
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
    class rectangle{
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
public class Custom_practice{
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();


        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
        routine kalash = new routine();
        kalash.wakeup();
        kalash.breakfast();      */
   rectangle rec = new rectangle();
   rec.l = 5; 
   rec.b = 6;
   System.out.println(rec.area());
   System.out.println(rec.perimeter());


    }
}