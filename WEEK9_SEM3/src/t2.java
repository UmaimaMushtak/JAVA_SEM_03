class University{
    String name;
    int ranking;
}
class Faculty extends University{
    String name;
    void Details(){
        System.out.println("University name: " + super.name);
        System.out.println("University ranking: " + ranking);
        System.out.println("Faculty name: " + name);
    }
}
class Department extends Faculty{
    String name;
    String chairman;
    void Details(){
        System.out.println("Department name = " + name);
        System.out.println("Chairman = " + chairman);
    }
    void Display(){
        super.Details();
        this.Details();
    }
}
public class t2 {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.name = "CS";
        d1.chairman = "ARF";
        d1.ranking = 1;
        ((University)d1).name = "Aligarh Muslim University";
        ((Faculty)d1).name = "Science";
        d1.Display();
    }
}
