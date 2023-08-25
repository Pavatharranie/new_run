package Inheritance;

public class Single extends class_1 {
   void b()
    {
        System.out.println("I am method b from child class");
    }

    public static void main(String[]args)
    {
        class_1 obj = new class_1();
       Single ob = new Single();
        obj.a();
        ob.b();
    }
}
