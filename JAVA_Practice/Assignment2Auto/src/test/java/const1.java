 class abc {
    int a;
    int b;
    abc(){
//       a=6;
//       b=0;
    }
    abc(int x, int y){
        a=x;
        b=y;
    }


}

 public  class const1
         {

             public static void main(String[] args) {

              //   abc obj1=new abc();

                 abc obj2=new abc(10,20);

//                 System.out.println(obj1.a);
                 System.out.println(obj2.a);
             }
         }
