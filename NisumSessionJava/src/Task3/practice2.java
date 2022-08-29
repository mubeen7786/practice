package Task3;

public class practice2 {
        int length;
        int width;
        void insert(int l,int w){
            length=l;
            width=w;
        }
        void calculateArea(){System.out.println(length*width);}
    }
    class Rectangle{
        public static void main(String args[]){

            practice2 r1=new practice2(),r2=new practice2();//creating two objects
            r1.insert(11,5);
            r2.insert(3,15);
            r1.calculateArea();
            r2.calculateArea();
        }

    }
