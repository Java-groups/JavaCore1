package HW11.model;

public class Plant {
    private  int size;
    private Color color;
    private Type type;
    public Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "black":
                return Color.Black;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }

    public Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "rose":
                return Type.Rose;
            case "peony":
                return Type.Peony;
            case "tulip":
                return Type.Tulip;
            default:
                throw new TypeException("Input only roses, tulips or peonies");
        }
    }


    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }



    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
