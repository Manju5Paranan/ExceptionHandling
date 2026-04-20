class E5{
    public void disp()
    {
        System.out.println("JAva");
    }





    public static void main(String[] args)
    {
       /* try{
            Class.forName("E6");
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println("Error");
        }*/
       E5 e=new E5();
       try{
        
        //e.show();
        e.getClass().getMethod("show");
       }
       catch(NoSuchMethodException e1)
       {
        System.out.println("Error");
       }
       System.out.println(e.getClass());

    }
}