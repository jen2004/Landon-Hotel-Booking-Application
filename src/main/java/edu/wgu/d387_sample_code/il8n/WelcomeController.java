package edu.wgu.d387_sample_code.il8n;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMessage(@RequestParam("lang") String language) {

        Locale locale = Locale.forLanguageTag(language);
        WelcomeMessage welcomeMessage = new WelcomeMessage(locale);
        return new ResponseEntity<String> (welcomeMessage.getWelcomeMessage(), HttpStatus.OK);
    }

}
