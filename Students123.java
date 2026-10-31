class Students123 {
    private int rollNo;
    private static int count = 0;

    Students123(int rollNo) {
        this.rollNo = rollNo;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class StaticDemo {
    public static void main(String[] args) {
        Students123 s1 = new Students123(101);
        Students123 s2 = new Students123(102);
        Students123 s3 = new Students123(103);

        System.out.println("Objects created = " + Students123.getCount());
    }
}
