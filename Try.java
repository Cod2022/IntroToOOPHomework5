import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Try {
    public static void main(String[] args) {
        String n = "35/4 + 2/5";
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder result = new StringBuilder();


        StringTokenizer s = new StringTokenizer(n);

        
        for (int i = 0; i < n.length(); i++) {
            Character c = n.charAt(i);
            if (c.equals('+')) { // разбить на два метода
                while (s.hasMoreTokens()) {
                    a.append(s.nextToken());
                    if (s.nextToken().equals("+")) {
                        b.append(s.nextToken());
                    }
                }
            }
        }

        System.out.println(a);
        System.out.println(b);

        // Integer result2 = 0;

        // for (int i = 0; i < a.length(); i++) {
        //     Character c = a.charAt(i);
        //     if (Character.isDigit(c)){
        //         result2 = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
        //         result.append(result2);
        //     }
        //     if (c.equals('/')) {
        //         result.append(c);
        //     }
        // }

        // System.out.println(result)
    }
}
