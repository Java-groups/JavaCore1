package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask2;

public enum Color {
    GREEN, RED, BLUE, YELLOW, AQUA;

    public static boolean isExists(String color) {
        for (Color value : values()) {
            if (value.toString().equals(color.toUpperCase())) {
                return true;
            }
        }
        throw new ColorException("The enum doesn`t contain such color.");
    }


    private static class ColorException extends RuntimeException {
        public ColorException(String s) {
            super("Color exception: " + s);
        }
    }


}
