class E3
{
    public static void main(String[] args)
    {
        //int[] a=new int[10];
        String s="Java";
        String s1=null;
        String s2="123a";
        try{
           // a[11]=2/0;
            System.out.println(s.charAt(1));
            System.out.println(s1.charAt(1));
            int n=Integer.parseInt(s2);
            System.out.println(n);

        }
       
            
       /*  catch(ArithmeticException e2)
        {
            System.out.println("Error1");
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Error");
        }*/
         catch(StringIndexOutOfBoundsException e1)
        {
            System.out.println("Error");
        }
        catch(NullPointerException e2)
        {
            System.out.println("Null pointer");
        }
        catch(NumberFormatException e3)
        {
            System.out.println("Numberexception");
        }
         System.out.println("JAva");
    }
}