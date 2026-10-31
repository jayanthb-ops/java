class Examples {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        Examples obj = new Examples();

        obj.display(10);
        obj.display(10.5);
    }
}