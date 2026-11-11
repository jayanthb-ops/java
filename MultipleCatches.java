
class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);

            int b = 42 / a; 
            // Fails if a == 0

            int[] c = {1};
            c[42] = 99;
            // Fails if a is not 0

        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }

        System.out.println("After try/catch blocks.");
    }
}
