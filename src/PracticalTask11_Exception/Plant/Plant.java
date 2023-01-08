package PracticalTask11_Exception.Plant;

public class Plant {
    public enum Color {RED, BLUE, ORANGE, WHITE, YELLOW, PINK}

    ;
    public enum Type {TYPE1, TYPE2, TYPE3}

    ;
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = size;
        this.color = Color.valueOf(color.toUpperCase());
        this.type = Type.valueOf(type.toUpperCase());
    }

    public Plant() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) throws ColorException {
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color);
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(String type) throws TypeException {
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (Exception e) {
            throw new TypeException(type);
        }
    }

    @Override
    public String toString() {
        return "\nPlant {" +
                "size = " + size +
                ", color = " + color +
                ", type = " + type +
                '}';
    }
}
