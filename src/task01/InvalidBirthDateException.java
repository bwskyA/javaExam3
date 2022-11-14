package task1;

public class InvalidBirthDateException extends IllegalArgumentException {
    public InvalidBirthDateException() {
        super();
    }

    public InvalidBirthDateException(String s) {
        super(s);
    }
}
