interface nowasys{
    abstract void sum();
    abstract  void subtract();
    void multiply();
    void divide();

}

class tan implements nowasys{
    public void sum( ){
        System.out.println("This is Sum Function");
    }

    @Override
    public void subtract() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void divide() {

    }

}
public class InterFcs {
    public static void main(String[] args) {
//        tan t1=new tan();
//        t1.sum();


        nowasys n1;
        n1=new tan();   // Runtime time polymarphisam (Dayanamic polymarphisam,OverRiding)
        n1.sum();


    }
}
