package Task_4_polymarphisam;

public class OverRiding_Polymarphisam {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

class Java extends OverRiding_Polymarphisam {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of Language class
        OverRiding_Polymarphisam l1 = new OverRiding_Polymarphisam();
        l1.displayInfo();
    }
}
