package HW3.task1;


public class Main {
	
	public Main() {}

    public static void main(String[] args) {
    	Task1 t = new Task1();

	    System.out.println(t.checkFloat(t.setFloat(3.4, 4.8, 6.1)));
		System.out.println("\nThe smallest number is " + t.getMin(t.setInteger(3, 7, 9)));
		System.out.println("\nThe bigest number is " + t.getMax(t.setInteger(3, 7, 9)));
    }

}
