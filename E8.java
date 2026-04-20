class E8{
    static void m1(int a,int b) throws ArithmeticException
    {
        try{
        //int n=a/b;
         if(b==0)
         {
            throw new ArithmeticException("Divid by zero error");
         }
         
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }

}
public static void main(String[] args)
{
    m1(10,0);
}
}