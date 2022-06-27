class cons
{
int a;
int b ;
cons()
{
    System.out.println("Default constructer");
     a= 0;
    b = 0;
}
cons(int x){
    System.out.println("One parameterized constructer");
    a= 10;
    b=x;

}
cons(int x, int y)
{
    System.out.println("Two parameterized constructer");
    a= x;
    b = y;
}

public int sum()
{
    System.out.println("This is the sum");
    int c= a+b;
    return c;
}
    public int Multiple()
    {
        System.out.println("This is the multiplication");
         int we = a*b;
        return we;
    }
    public int Divide()
    {
        System.out.println("This is the division");
        int u = a/b;
        return u;
    }
    public int Subtract()
    {
        System.out.println("This is the Subtraction");
       int g = a-b;
        return g;
    }
        }



public class Task1 {
    public static void main(String[] args) {
       cons myobj = new cons(9, 7);
//        System.out.println(myobj);
//        System.out.println(myobj.a);
        int m= myobj.sum();
        System.out.println(m);
        int n= myobj.Multiple();
        System.out.println(n);
    }
}






