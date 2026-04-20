import java.util.*;
class E1
{
     public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            try{
                try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
                }
            
            catch(InputMismatchException e)
            {
                System.out.println("This is input mismatch exception");
            }
        }
            catch(ArithmeticException ae)
            {
                System.out.println("This is Arithmetuic exception");
            }
           /* catch(Exception e)
            {
                System.out.println("Exception occurred give the corect one");
            }*/
            System.out.println("Java"); 
            finally{
                System.out.println("MNJU");
            }
        }
        
    }
}