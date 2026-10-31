class A {
    void showA() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is class B");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        B obj = new B();

        obj.showA();
        obj.showB();
    }
}
