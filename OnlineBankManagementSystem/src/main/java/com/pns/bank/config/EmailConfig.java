package com.pns.bank.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailConfig {
	
	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String toEmail, String subject, String body) {
		
		  SimpleMailMessage message = new SimpleMailMessage();
		  
		  message.setFrom("gavaliganesh37@gmail.com"); 
		  message.setTo(toEmail);
		  message.setText(body);
		  message.setSubject(subject);
		  mailSender.send(message);
		  
		  System.out.println("mail send Successfully");
		 
		
		 
		
		  
		
	}

}
