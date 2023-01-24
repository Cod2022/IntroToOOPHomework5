import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try3 {
    public static void main(String[] args) {
        String input = "23/6*95+54:34";
        // Pattern pNum = Pattern.compile("\\b[0-9]\\.+\\b");
        Pattern pNum = Pattern.compile("-?\\d+");
        Pattern pAct = Pattern.compile("[+\\-*:]");

        List<Integer> nums = new ArrayList<>();
        List<String> acts = new ArrayList<>();

        Matcher mNum = pNum.matcher(input);
        Matcher mAct = pAct.matcher(input);

        while (mNum.find()) {
            nums.add(Integer.parseInt(mNum.group()));
        }

        while (mAct.find()) {
            acts.add(mAct.group());
        }

        System.out.println(acts);
        System.out.println(nums);
    }
}
