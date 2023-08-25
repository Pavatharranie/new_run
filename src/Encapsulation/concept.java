package Encapsulation;

public class concept {
    public String name;
    private int password;

    void login(String name, int password)
    {
        this.name = name;
        this.password = password;

    }
    public static void main(String[] args)
    {
        concept obj = new concept();
        obj.login("pava", 2345);
    }
}
