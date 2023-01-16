package arthurmkrtchian.javaCore.HW04.arraysLoops.homeWorks.homeWork2;


public class Result {

    public enum Type {
        SUM, PRODUCT
    }

    private int value;
    private Type type;

    public Result(int value, Type type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return value == result.value && type == result.type;
    }

    public int getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }
}
