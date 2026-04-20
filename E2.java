import java .util.*;
class E2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
    
        System.out.println(a/b);
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Divisionby 0");
        }
        catch(InputMismatchException e2)
        {
            System.out.println("give intger input");
        }
        /*catch(Exception e)
        {
            System.out.println("give corrt input");
        }*/
        System.out.println("Java");
    }
}