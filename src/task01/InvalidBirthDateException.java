package task01;

public class InvalidBirthDateException extends IllegalArgumentException {
    public InvalidBirthDateException() {
        super();
    }

    public InvalidBirthDateException(String s) {
        super(s);
    }
}
