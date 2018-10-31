package exceptions;

public class MyException extends RuntimeException {

    public MyException(String msg){
        super("nie ma pola");
    }
}
