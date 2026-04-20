class MyException extends Exception{
    MyException(String message)
    {
    super(message);
    }
}
class E9{
    static void m1(int age) throws MyException
    {
        if(age<18)
        {
            throw new MyException("manju");
        }
        else{
            System.out.println("karthik");
        }
    }

    public static void main(String[] args)
    {
        try{
            m1(15);
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }

    }
}