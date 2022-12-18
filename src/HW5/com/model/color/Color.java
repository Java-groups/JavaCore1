package HW5.com.model.color;

public class Color{

    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void print(){
        System.out.println("Print from Color");
    }

}
