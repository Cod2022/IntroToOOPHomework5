package MyCalc;

public class Presenter {
    View view;
    Model model;

    public Presenter() {
        
    }

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void startProgram(String input) {
        RationalCalc rationalCalc = new RationalCalc(null, null);
        rationalCalc.splitString(input);
        view.printResult(rationalCalc.calcRational(rationalCalc));
    }
}
