
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Test4 {

    public static int divide(int a, int b)
            throws DivideByZeroException {

        if (b == 0) {
            throw new DivideByZeroException(
                "Cannot divide by zero!"
            );
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

