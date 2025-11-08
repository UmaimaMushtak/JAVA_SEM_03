package week10_sem3;
class University{
    String name;
    int ranking;
}
class Faculty extends University{
    String name;
    void Details(){
        System.out.println("University: " + super.name);
        System.out.println("Ranking: "+ranking);
        System.out.println("Faculty: "+this.name);
    }
}
class Department extends Faculty{
    String name;
    String chairman;
    void Details(){
        System.out.println("Department: "+name);
        System.out.println("Chairman: "+chairman);
    }
    void Display(){
        super.Details();
        this.Details();
    }
}
public class t5 {
    public static void main(String[] args) {
        Department CS = new Department();
        ((University)CS).name = "Aligarh Muslim University";
        ((Faculty)CS).name = "Science";
        CS.name = "Computer Science";
        CS.ranking = 1;
        CS.chairman = "ARF";
        CS.Display();
    }
}
