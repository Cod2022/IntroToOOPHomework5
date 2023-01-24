package MyCalc;

public class Main {
    public static void main(String[] args) {
        
        String input = "3/5+4/2";

        RationalCalc rationalCalc = new RationalCalc(null, null);
        rationalCalc.splitString(input);
        System.out.println(rationalCalc.calcRational(rationalCalc));
        

        System.out.println(rationalCalc.getNums());
        System.out.println(rationalCalc.getActs());
    }
}
