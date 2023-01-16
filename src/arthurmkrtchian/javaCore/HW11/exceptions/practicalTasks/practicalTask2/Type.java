package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask2;

public enum Type {
    HERB, SHRUB, TREE, CLIMBER, CREEPER, CHAMELEON_FLOWER; //Chameleon flowers can change color


    public static boolean isExists(String type) {
        for (Type value : values()) {
            if (value.toString().equals(type.toUpperCase())) {
                return true;
            }
        }
        throw new TypeException("The enum doesn`t contain such type.");
    }


    private static class TypeException extends RuntimeException {
        public TypeException(String s) {
            super("Type exception: " + s);
        }
    }
}


