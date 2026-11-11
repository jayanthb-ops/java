package my_package;

public class AccessDemo {

    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void display() {

        System.out.println("Public = " + a);
        System.out.println("Private = " + b);
        System.out.println("Protected = " + c);
        System.out.println("Default = " + d);
    }
}
