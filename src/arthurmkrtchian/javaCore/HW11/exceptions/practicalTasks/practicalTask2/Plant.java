package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask2;


//        2. Create a class Plant, which includes fields int size, Color color and Type type, and
//        constructor where these fields are initialized. Color and type are Enum. Override the
//        method toString( ). Create classes ColorException and TypeException and describe there all
//        possible colors and types of plants. In the method main create an array of five plants.
//        Check to work your exceptions.


//All properties of Plant class objects can be changed except the type property.


public class Plant {
    private int size;
    private Color color;
    private Type type;

    @Override
    public String toString() {
        return "Plant{" +
                "size: " + size +
                ", color: " + color +
                ", type: " + type +
                "}\n";
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

    public void setColor(String color) {
        this.color = Color.valueOf(color.toUpperCase());
    }

    public Type getType() {
        return type;
    }

    private void setType(String type) {
        this.type = Type.valueOf(type.toUpperCase());
    }

    public Plant(int size, String color, String type) {
        this.size = size;
        if (Color.isExists(color) && Type.isExists(type)) {
            setColor(color);
            setType(type);
        }
    }

}


