package org.dev.mailapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
@RequestMapping("mail")
public class MailController {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping
	public String sendMail() throws Exception{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		helper.setTo("1804376@kiit.ac.in");
		helper.setSubject("this is the subject line");
		helper.setText("this is the body of the mail .................. this is the text");
		javaMailSender.send(mime);
		return "mail sent successfully";
	}
}
