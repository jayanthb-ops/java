class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
public class Student4 {
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be at least 18.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
            System.out.println("Age is valid.");
        } catch (AgeValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
