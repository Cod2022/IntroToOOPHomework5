package MyCalc;

public class Main {
    public static void main(String[] args) {
        
        String input = "3/5+4/2";

        Presenter p = new Presenter(new RationalCalc(), new View());
        p.startProgram(input);
        
    }
}
