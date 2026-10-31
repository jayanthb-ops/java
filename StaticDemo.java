class Studentss {
private int rollNo;
private static int count = 0;
Studentss(int rollNo) {
this.rollNo = rollNo;
count++;
}
public static int getCount() {
return count;
}
}
class StaticDemo {
public static void main(String[] args) {
Studentss s1 = new Studentss(101);
Studentss s2 = new Studentss(102);
Studentss s3 = new Studentss(103);
System.out.println("Objects created = " + Studentss.getCount());
}
}