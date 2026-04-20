class E7{
    public static void main(String[] args)
    {
           int age =15;
           try{
           if(age<18)
           {
            throw new Exception("Exception handled");
           }
        }
           catch(Exception e)
           {
            System.out.println(e.getMessage());
           }
    }
}