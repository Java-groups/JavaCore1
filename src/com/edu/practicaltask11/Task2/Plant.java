package com.edu.practicaltask11.Task2;

public class Plant {
    private static Type type;
    private static Color color;
    private int size;


    public Plant(String type, String color, int size) throws TypeException, ColorException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);

        this.size = size;
        this.type = t;
        this.color = c;

    }

    @Override
    public String toString() {
        return "Plant: \nType: " + type + "; Color: " + color + "; Size: " + size + ";\n";
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "fruit":
                return Type.FRUIT;
            case "greenery":
                return Type.GREENERY;
            case "berry":
                return Type.BERRY;
            default:
                throw new TypeException("Input only type fruit, greenery or berry");

        }
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "green":
                return Color.GREEN;
            case "yellow":
                return Color.YELLOW;
            case "red":
                return Color.RED;
            default:
                throw new ColorException("Input only color green, yellow or red");
        }
    }
}

