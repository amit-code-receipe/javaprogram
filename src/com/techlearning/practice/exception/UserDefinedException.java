package src.com.techlearning.practice.exception;

public class UserDefinedException extends Exception{
    private String msg;

    public UserDefinedException(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public UserDefinedException(){
        super();
    }
}
