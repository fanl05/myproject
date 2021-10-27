package mapstruct.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Ryland
 */
public class DateTransform {

    public static LocalDateTime str2Date(String str) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(str, df);
    }

    public static String date2Str(LocalDateTime time) {
        return time.toString();
    }

}
