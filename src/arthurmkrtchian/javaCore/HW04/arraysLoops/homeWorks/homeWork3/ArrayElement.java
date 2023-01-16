package arthurmkrtchian.javaCore.HW04.arraysLoops.homeWorks.homeWork3;

public class ArrayElement {
    private int value;
    private int position;

    public ArrayElement(int value, int position) {
        this.value = value;
        this.position = position;
    }

    public ArrayElement() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayElement that = (ArrayElement) o;
        return value == that.value &&
                position == that.position;
    }

}
