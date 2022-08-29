package Task1;
                     //There are different fucntions for the loops

public class Loops {
    public static void main(String[] args) {
    //forloop();
       // nestedloop();      // uncomment this for the nested loop
       // ForEach();          // // uncomment this for the foreach loop
        //whileloop();       // uncomment this for the while loop
        DoWhile();           // uncomment this for the Do While loop
    }
    public static void forloop()
    {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void nestedloop()
    {
        for(int i=1;i<=3;i++){
//loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j
    }
    public static void  ForEach()
    {
        //Declaring an array
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void whileloop()
    {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    public static void DoWhile()
    {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
}

}


