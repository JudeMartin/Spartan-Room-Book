package sjsu.edu.cmpe275.service.impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailServiceImpl {

	private JavaMailSender mailSender;
	private SimpleMailMessage simpleMailMessage;

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendMail(String to,String dear, String content) {

	MimeMessage message = mailSender.createMimeMessage();

	try {
	MimeMessageHelper helper = new MimeMessageHelper(message, true);
	//message.setContent(someHtmlMessage, "text/html; charset=utf-8");
	
	helper.setFrom(simpleMailMessage.getFrom());
	helper.setTo(to);
	helper.setSubject("Booking confirmation from Hotel Sparta");
//	helper.setText(String.format(simpleMailMessage.getText(), dear,
//	content));
//	
	helper.setText(content, true);

	} catch (MessagingException e) {
	throw new MailParseException(e);
	}
	
	mailSender.send(message);
	}

}
