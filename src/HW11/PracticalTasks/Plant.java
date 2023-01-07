package HW11.PracticalTasks;

enum Color {
    GREEN, WHITE, RED;
}

enum Type {
    HERBS, TREES, SHRUBS;
}

public class Plant {
    int size;
    Color color;
    Type type;

    public class ColorException extends Exception {
        public ColorException(String str) {
            super(str);
        }
    }

    public class TypeException extends Exception {
        public TypeException(String str) {
            super(str);
        }
    }

    public Color colorStringToEnum(String color) throws ColorException {
        if (color.equalsIgnoreCase("green")) {
            return Color.GREEN;
        } else if (color.equalsIgnoreCase("white")) {
            return Color.WHITE;
        } else if (color.equalsIgnoreCase("red")) {
            return Color.RED;
        } else throw new ColorException("Enter green, white or red color");
    }

    public Type typeStringToEnum(String type) throws ColorException, TypeException {
        if (type.equalsIgnoreCase("herbs")) {
            return Type.HERBS;
        } else if (type.equalsIgnoreCase("shrubs")) {
            return Type.SHRUBS;
        } else if (type.equalsIgnoreCase("trees")) {
            return Type.TREES;
        } else throw new TypeException("Enter herbs,shrubs or trees");
    }

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        Color c = colorStringToEnum(color);
        Type t = typeStringToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(4, "green", "trees");
            System.out.println(plants[0]);
            plants[1] = new Plant(3, "red", "shrubs");
            System.out.println(plants[1]);
            plants[2] = new Plant(1,"red","herbs");
            System.out.println(plants[2]);
            plants[3] = new Plant(5, "black", "tress");
            System.out.println(plants[3]);
            plants[4] = new Plant(2,"red", "rocks");
            System.out.println(plants[4]);

//            for (int i = 0; i < plants.length; i++) {
//                System.out.println(plants[i]);
//            }

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
        System.out.println("end");

    }
}
