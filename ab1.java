//abstract class cannot be instantiated directly, but it can be subclassed. In this example, we have an abstract class `ab` with an integer variable `a`. The class `ab1` extends the abstract class `ab` and adds another integer variable `b`. The `display` method prints the values of both variables. In the `main` method, we create an instance of `ab1` and call the `display` method to show the values of `a` and `b`.
abstract class ab {
    int a=10;
}
public class ab1 extends ab {
    int b=20;
    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        ab1 obj = new ab1();
        obj.display();
    }
}
