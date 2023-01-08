package PracticalTask11_Exception.Plant;

public class ColorException extends Exception {
    public ColorException(String message) {
        super("Invalid color: " + message);
    }
}
