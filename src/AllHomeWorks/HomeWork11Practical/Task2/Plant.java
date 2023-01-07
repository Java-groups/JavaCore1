package AllHomeWorks.HomeWork11Practical.Task2;

public class Plant  {
    int size;
    Color color;
    Type type;

   public Plant(String type, String color, int size) throws ColorException, TypeException{
       Color c;
       Type t;
       try {
           c = Color.valueOf(color);
       } catch (IllegalArgumentException e) {
           throw new ColorException("{"+ color + "} Input only color Yellow, Green, Blue, Black, Brown, Red, or Red");
       }
       try {
           t = Type.valueOf(type);
       } catch (IllegalArgumentException e) {
           throw new TypeException("{"+ type + "} Input only type chamomile, rose, tulip, knapweed or anemone");
       }
        this.type = t;
        this.color = c;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plant{" +
                " type=" + type +
                ", color=" + color +
                ", size=" + size +
                " }";
    }
    public void info() {
        System.out.println(this);
    }
}
