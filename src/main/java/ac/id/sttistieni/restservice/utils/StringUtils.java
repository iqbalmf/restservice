package ac.id.sttistieni.restservice.utils;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class StringUtils {

    /*getting random String*/
    private static String randomUUID(){
        return UUID.randomUUID().toString();
    }

    /*getting timestamp from datetime*/
    private static String timeStampDate(String dateTime) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date time = dateFormat.parse(dateTime);
        return new Timestamp(time.getTime()).toString();
    }
}
