package edu.wgu.d387_sample_code.il8n;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TZConversionController {

    @GetMapping("/presentation-times")
    public ResponseEntity<String> displayPresentationTimes() {
        String presentationAnnouncement = "The Landon Hotel will host an online live presentation on October 4, 2024 at: " + TimeConversion.displayTimeZones() + ".  " + "You can access the Zoom meeting link here 4 hours prior to the presentation start time.";
        return new ResponseEntity<String> (presentationAnnouncement, HttpStatus.OK);
    }
}
