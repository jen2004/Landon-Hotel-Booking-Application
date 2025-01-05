package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

	// PART B1b: Create threads for welcome messages

		WelcomeMessage welcomeMessageEnglish = new WelcomeMessage(Locale.US);
		Thread englishThread = new Thread(welcomeMessageEnglish);
		englishThread.start();

		WelcomeMessage welcomeMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frenchThread = new Thread(welcomeMessageFrench);
		frenchThread.start();



	}

}
