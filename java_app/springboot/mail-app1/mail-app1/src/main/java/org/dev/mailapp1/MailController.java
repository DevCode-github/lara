package org.dev.mailapp1;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
@RequestMapping("mail")
public class MailController {
	
	@GetMapping
	public String sendMail() throws Exception{
		JavaMailSender javaMailSender = getJavaMailSender();
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime,true);
		helper.setTo("1804376@kiit.ac.in");
		helper.setSubject("this is the subject line");
		helper.setText("this is the body of the mail .................. this is the text",true);
		javaMailSender.send(mime);
		return "mail sent";
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	      
	    mailSender.setUsername("divyanshu.sunnykumar1999@gmail.com");
	    mailSender.setPassword("tbuuximfbehgdfug");
	      
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	      
	    return mailSender;
	}
}
