package MyCalc;

import java.util.StringTokenizer;

public class RationalCalc extends CalcModel{
    
    @Override
    public String rationalNumSum(String stringInput) {
        this.a = new StringBuilder();
        this.b = new StringBuilder();
        this.result = new StringBuilder();
        this.s = new StringTokenizer(stringInput);
        
        while (s.hasMoreTokens()) {
            a.append(s.nextToken());
            if (s.nextToken().equals("+")) {
                b.append(s.nextToken());
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            Character c = a.charAt(i);
            if (Character.isDigit(c)){
                sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
                result.append(sum);
            }
            if (c.equals('/')) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
