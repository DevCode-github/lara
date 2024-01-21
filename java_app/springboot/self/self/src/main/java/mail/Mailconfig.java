package mail;

import java.util.Properties;

import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@RestController
@RequestMapping("mail2")
public class Mailconfig {
	@GetMapping("m1")
	public ResponseEntity<String> getJavaMailSender() throws MessagingException{
		JavaMailSenderImpl impl = new JavaMailSenderImpl();
		impl.setHost("smtp.gmail.com");
		impl.setUsername("divyanshu.sunnykumar1999@gmail.com");
		impl.setPassword("tbuuximfbehgdfug");
		impl.setPort(587);
		Properties prop = impl.getJavaMailProperties();
//		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.timeout", "5000");
		prop.put("mail.smtp.connectiontimout","5000");
		prop.put("mail.smtp.writetimeout","5000");
		MimeMessage mime = impl.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		helper.setTo("1804376@kiit.ac.in");
		helper.setSubject("for practice");
		helper.setText("");
		impl.send(mime);
		return ResponseEntity.ok().header("conten-type", "text/plain").body("mail sent");
	}
}
