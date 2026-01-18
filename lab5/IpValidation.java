import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidation {

    public static void main(String[] args) {

        String ip = "192.168.1.1";

        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        Matcher matcher = pattern.matcher(ip);

        System.out.println(matcher.matches());

    }
}