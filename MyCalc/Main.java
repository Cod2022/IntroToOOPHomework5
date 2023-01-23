package MyCalc;

public class Main {
    public static void main(String[] args) {
        String string = "6/4 - 8/9";
        RationalCalc calc = new RationalCalc();
        System.out.println(calc.rationalNumSum(string));
    }
}
