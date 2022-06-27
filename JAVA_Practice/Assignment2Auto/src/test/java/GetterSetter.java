class xyz{
        private int id;
        private String m;
    void setId(int x){
        id=x;
    }
    int getId(){
        return id;
    }
    void setM(String x)
    {
        m=x;
    }
    String getM(){
        return m;
    }

}
class xyz1{
    private int id;
    private String m;
    void setId(int x){
        id=x;
    }
    int getId(){
        return id;
    }
    void setM(String x)
    {
        m=x;
    }
    String getM(){
        return m;
    }

}

public class GetterSetter {
    public static void main(String[] args) {
        xyz x1=new xyz();
        x1.setId(24434);

        //int c=x1.getId();
        System.out.println(x1.getId());
        //x1.m;      Because m is the private member that's why we can't acces this directly.

        x1.setM("Hi");
        System.out.println(x1.getM());
    }

}
