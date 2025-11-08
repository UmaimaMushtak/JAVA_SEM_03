class Student{
    int rollNo;
    String name;
    int marks;
    static String schoolName;
    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    static void changeSchoolName(String newSchoolName){
        schoolName = newSchoolName;
    }
    void display(){
        System.out.println("rollNo = " + rollNo);
        System.out.println("name = " + name);
        System.out.println("marks = " + marks);
        System.out.println("school Name = " + schoolName);
    }
}
public class op5 {
    public static void main(String[] args) {
        Student s1 = new Student(20, "sam", 100);
        s1.schoolName = "APS";
        Student s2 = new Student(21, "andrew", 50);
        s2.display();
    }
}
