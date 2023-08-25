package Inheritance;

public class multi_level extends Single{
    void c()
    {
        System.out.println("I am method c from class super child");
    }
    public static void main (String [] args)
    {
        multi_level o = new multi_level();
        Single ob = new Single();
        ob.a();
        ob.b();
        o.c();

    }
}
