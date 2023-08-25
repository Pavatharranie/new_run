package Polymorphism;

public class Compile_time {
    void java(String a, float b)
    {
        System.out.println(a +" is an freeware " + "which is used by more than "+b +"L users");
    }

    void java(String a, float b, String c)
    {
        System.out.println(a +" gives its " +b +"% with " + c);
    }
    public static void main (String [] args)
    {
        Compile_time object = new Compile_time();
        object.java("JAVA", 10.8f);
        object.java("JAVA", 99.9f,"Selenium");
    }
}
