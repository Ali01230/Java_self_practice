package m46_error_exception_handling;

public class InvalidNameException extends RuntimeException {

    private String fieldName;

    public InvalidNameException() {
        super("You have entered nothing!!");
    }

    public InvalidNameException(String fieldName, String message) {
        super(message);
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    // Additional methods or fields can be added as needed
}

