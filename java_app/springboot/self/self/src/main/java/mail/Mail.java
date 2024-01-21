package mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@RestController
@RequestMapping("mail")
public class Mail {
	@Autowired
	public JavaMailSender javaMailSender;
	
	@GetMapping("m1")
	public ResponseEntity<String> mail() throws MessagingException{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		helper.setTo("1804376@kiit.ac.in");
		helper.setSubject("for practice");
		helper.setText("you are a peice of shit, focus on what's important");
		javaMailSender.send(mime);
		return ResponseEntity.ok().body("mail sent");
	}
}
