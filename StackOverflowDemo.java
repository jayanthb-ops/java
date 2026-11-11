
class StackOverflowDemo {

    static void display() {
        System.out.println("Calling display method...");
        display();
    }

    public static void main(String[] args) {
        display();
    }
}

