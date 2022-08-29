package Task_4_polymarphisam;

public class Overloading_PolyMarphisam {
    // method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    // method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Overloading_PolyMarphisam d1 = new Overloading_PolyMarphisam();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');
    }
}
