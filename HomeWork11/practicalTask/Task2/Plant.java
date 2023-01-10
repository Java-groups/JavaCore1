package edu.homeworks.hw11.practicalTask.Task2;

public class Plant {
    int size;
    Color color;
    Type type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Color c(String color) throws ColorException {
        if(color.equals("red")){
            return Color.RED;
        }
        else if(color.equals("pink")){
            return Color.PINK;
        }
        else if(color.equals("yellow")){
            return Color.YELLOW;
        }else if(color.equals("black")){
            return Color.BLACK;
        } else throw new ColorException("Invalid color");
    }

    public Type t(String type) throws TypeException {
        if(type.equals("annuals")){
            return Type.Annuals;
        }
        else if(type.equals("perennials")){
            return Type.Perennials;
        }
        else if(type.equals("biennials")){
            return Type.Biennials;
        } else throw new TypeException("Invalid type");
    }

    public Plant(int size,String color,String type) throws TypeException,ColorException{
        Color color1 = c(color);
        Type type1 = t(type);
        this.size = size;
        this.color = color1;
        this.type = type1;
    }

    @Override
    public String toString(){
        return "Size " + size + "\n Color = " + color + "\n Type = " + type;
    }
}

enum Color {
    RED,
    BLACK,
    YELLOW,
    PINK
}

enum Type {
    Annuals,
    Perennials,
    Biennials
}

