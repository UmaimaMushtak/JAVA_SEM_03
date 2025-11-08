package week10_sem3;
class Employee{
    String empName;
    int empId;
    Salary s;
    JoiningDate jd;

    public class Salary{
        int basic;
        int hra;
        int pf;
        void displaySalary(){
            System.out.println("Salary - Basic: "+basic+" Hra: "+hra+" Pf: "+pf);
        }
    }

    public class JoiningDate{
        int day;
        String month;
        int year;

        void displayJoiningDate(){
            System.out.println("Joining date - "+day+","+month+","+year);
        }
    }

    void DisplayEmployee(){
        System.out.println("Name: "+empName);
        System.out.println("ID: "+empId);
        if(s!=null){
            s.displaySalary();
        }
        if(jd!=null){
            jd.displayJoiningDate();
        }
    }
}
public class op1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empName = "Umaima";
        e1.empId = 20;

        e1.s = e1.new Salary();
        e1.jd = e1.new JoiningDate();

        e1.s.basic = 1000;
        e1.s.hra = 2000;
        e1.s.pf = 3000;
        e1.jd.day = 1;
        e1.jd.month = "January";
        e1.jd.year = 2025;
        e1.DisplayEmployee();
    }
}
