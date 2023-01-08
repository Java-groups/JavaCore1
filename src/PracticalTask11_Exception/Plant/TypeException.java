package PracticalTask11_Exception.Plant;

public class TypeException extends Exception {
    public TypeException(String message) {
        super("Invalid type: " + message);
    }
}
