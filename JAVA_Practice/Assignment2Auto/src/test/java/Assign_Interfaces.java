
interface CommonFeatures{
    abstract void ABC();
    abstract  void CDE();
    void MNO();
    void XYZ();
}
class childClass implements CommonFeatures
{

    @Override
    public void ABC() {
        System.out.println("This is ABC function");
    }

    @Override
    public void CDE() {
        System.out.println("This is CDE function");

    }

    @Override
    public void MNO() {
        System.out.println("This is ABC function");

    }

    @Override
    public void XYZ() {
        System.out.println("This is ABC function");

    }
}



public class Assign_Interfaces {
    public static void main(String[] args) {
        childClass myboj = new childClass();
        myboj.XYZ();
    }
}
