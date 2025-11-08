package week12;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class t2 {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Age should be between 18 and 100.");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void processAge(int age) throws InvalidAgeException {
        validateAge(age);
    }

    public static void main(String[] args) {
        int userAge = 15;
        try {
            processAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
