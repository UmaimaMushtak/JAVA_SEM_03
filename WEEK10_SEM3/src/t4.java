package week10_sem3;
class ObjectOriented{
    public void abstraction(){
        System.out.println("ABSTRACTION");
    }
    public void polymorphism(){
        System.out.println("POLYMORPHISM");
    }
    public void inheritance(){
        System.out.println("INHERITANCE");
    }
}
class JavaLanguage extends ObjectOriented{
    public void persistence(){
        System.out.println("PERSISTENCE");
    }
    public void interfaces(){
        System.out.println("INTERFACES");
    }
}
class C extends ObjectOriented{
    public void template(){
        System.out.println("TEMPLATE");
    }
    public void friendFunction(){
        System.out.println("FRIENDFUNCTION");
    }

}
public class t4 {
    public static void main(String[] args) {
        C c = new C();
        c.abstraction();
        c.polymorphism();
        c.inheritance();
        c.friendFunction();
        c.template();
    }
}
