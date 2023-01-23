import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Try {
    public static void main(String[] args) {
        String n = "3/4 + 2/5";
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder result = new StringBuilder();


        StringTokenizer s = new StringTokenizer(n);

        List<String> t = new ArrayList<>();
        List<String> d = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            Character c = n.charAt(i);
            if (c.equals('+')) { // разбить на два метода
                while (s.hasMoreTokens()) {
                    t.add(s.nextToken());
                    // a.append(s.nextToken());
                    if (s.nextToken().equals("+")) {
                        // s.nextToken("+");
                        // s.nextToken(" ");
                        d.add(s.nextToken());
                        // b.append(s.nextToken());
                    }
                }
            }
        }

        // System.out.println(a);
        // System.out.println(b);
    
        System.out.println(t);
        System.out.println(d);


        
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
