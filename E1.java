 class E1 {
    static void assignment(int cpal) throws IllegalArgumentException
    {
        if(cpal<5)
        {
            throw new IllegalArgumentException("Assignment marks will not be 5");
        }
        else{
            System.out.println("Full marks will be given");
        }
    }
    public static void main(String[] args)

    {
        try{
          assignment(4);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
}
