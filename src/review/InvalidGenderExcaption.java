package review;

public class InvalidGenderExcaption extends RuntimeException{

    public InvalidGenderExcaption(String message) {
        super(message);
    }

    public InvalidGenderExcaption() {
        super("Invalid gender is given");
    }
}
