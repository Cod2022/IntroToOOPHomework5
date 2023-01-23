package MyCalc;

public class Main {
    public static void main(String[] args) {
        String string = "6/4 + 8/9";
        String string2 = "6/4 - 8/9";
        String string3 = "6/4 * 8/9";
        String string4 = "9/9 : 3/3";

        RationalCalc calc = new RationalCalc();
        System.out.println(calc.rationalNumSum(string));
        System.out.println(calc.rationalNumSubtract(string2));
        System.out.println(calc.rationalNumMult(string3));
        System.out.println(calc.rationalNumDivide(string4));
    }
}
