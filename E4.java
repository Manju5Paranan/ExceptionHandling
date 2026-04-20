class E4{
    public static void main(String[] args)
    {
        try{
            String s=args[0];
            try{
                int n=Integer.parseInt(s);
                int res= 10/n;
                System.out.println(res);

            }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("AIOE");
            }
        
        }
        catch(NumberFormatException e2)
        {
            System.out.println("NFE");
        }
        catch(ArithmeticException e3)
        {
            System.out.println("AE");
        }
        
    }
}