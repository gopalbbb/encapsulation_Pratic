package customException;

class UnderAgeException extends Exception {

    UnderAgeException() {
        super("you are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}





