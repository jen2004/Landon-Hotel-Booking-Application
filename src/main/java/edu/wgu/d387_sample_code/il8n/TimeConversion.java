package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin
public class TimeConversion {

    public static final DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm a");

    public static String displayTimeZones(){

        String presentationTime = "2024-10-04T22:00:00Z";
        ZonedDateTime dateTime = ZonedDateTime.parse(presentationTime);

        ZoneId estTimeZone = ZoneId.of("America/New_York");
        ZoneId mtTimeZone = ZoneId.of("America/Denver");
        ZoneId utcTimeZone = ZoneId.of("UTC");

        ZonedDateTime estTime = dateTime.withZoneSameInstant(estTimeZone);
        ZonedDateTime mtTime = dateTime.withZoneSameInstant(mtTimeZone);
        ZonedDateTime utcTime = dateTime.withZoneSameInstant(utcTimeZone);

        String estTimeString = estTime.format(formatTime);
        String mtTimeString = mtTime.format(formatTime);
        String utcTimeString = utcTime.format(formatTime);

        return estTimeString + " ET | " + mtTimeString + " MT | " + utcTimeString + " UTC";

    }


}
