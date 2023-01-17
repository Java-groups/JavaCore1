package helper;

public class Ex {

    public static void main(String[] args) {

//        Operator operator = Integer::sum;
//        Operator operator2 = (a,b) -> ((double) (a+b)*2)/3;
//        Operator operator3 = Integer::rotateRight;
//
//        System.out.println(operator.operate(5,6));
//        System.out.println(operator2.operate(5,6));
//        System.out.println(operator3.operate(10, 57));

        Operator division = (a,b) -> (double) a/b;

        System.out.println(opernate(21,7,division));
        System.out.println(opernate(8127, 322, division));

    }

    interface Operator{
        double operate(int a, int b);
    }

    private static double opernate(int a, int b, Operator operator){
        return  operator.operate(a, b);
    }
}
