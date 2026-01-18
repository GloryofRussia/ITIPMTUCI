import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUpperAfterLower {

    public static void main(String[] args) {

        String text = "asdsada dasd aADdsads asdaSds";

        // Находит строчную букву, за которой сразу следует заглавная буква
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("!$1$2!");
        System.out.println(result);
    }
}