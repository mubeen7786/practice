package Task2;

public class JavaFunctions {
    public static void main(String[] args) {
    //square(2); // Functions for the Square
   // display1(); //Simple function without arguments
    //display2(2);  //Simple function with argument
        Square(3);
         }
                                                                    // Simple method in java
    public static int square(int num) {
        int result;
        result = (num * num); // store returned value to result and calling the method
        System.out.println("Squared value of 10 is: " + result);
        return result; // return statement
    }

    // method with no parameter
    public static void display1() {
        System.out.println("Method without parameter");
    }

    // method with single parameter
    public static void display2(int a) {
        System.out.println("Method with a single parameter: " + a);
    }

    public static void Square(int a)
    {
    int b=0;

        for(int i= 0; i <10; i++)
        {
            b = i*i;
        System.out.println("Square of " + i +  "   is   " + b);

    }
        //return b;
    }
    }


