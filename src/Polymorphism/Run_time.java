package Polymorphism;

public class Run_time {
    void salary(String a)
    {
        System.out.println("Salary day is also important for " + a);
    }
    public static void main (String [] args) {
        Run_time obj1 = new Run_time();
        common_class obj2 = new common_class();
        obj2.salary(" every Employee");
        obj1.salary("Employers");

    }

}
