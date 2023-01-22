package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask2;

import java.io.IOException;

public enum Color {
    GREEN, RED, BLUE, YELLOW, AQUA;

    public static boolean isExists(String color) throws ColorException {
        for (Color value : values()) {
            return value.toString().equals(color.toUpperCase());
        }
        throw new ColorException("The enum doesn`t contain such color.");
    }


    private static class ColorException extends IOException {
        public ColorException(String s) {
            super("Color exception: " + s);
        }
    }


}
