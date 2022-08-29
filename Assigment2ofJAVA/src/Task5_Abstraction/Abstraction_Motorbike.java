package Task5_Abstraction;

public abstract class Abstraction_Motorbike {
    abstract void brake();
}

class SportsBike extends Abstraction_Motorbike {

    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends Abstraction_Motorbike {

    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}

class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}
