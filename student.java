public class student {
    String name;
    Student(String name) {
        this.name = name;
    }
}
class PassObject{
    static void changeName(student s, String newName) {
        s.name = "Ravi";
    }
    public static void main(String[] args) {
        student s1 = new Student("anu");
        
        changeName(s1,);
        System.out.println(s1.name);
    }
}