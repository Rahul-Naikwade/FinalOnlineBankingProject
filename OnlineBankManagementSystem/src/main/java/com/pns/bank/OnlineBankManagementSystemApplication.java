package com.pns.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.pns.bank.config.EmailConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OnlineBankManagementSystemApplication {

	@Autowired
	private EmailConfig emailService;

	public static void main(String[] args) {
		SpringApplication.run(OnlineBankManagementSystemApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {
		emailService.sendEmail("nikhilpatare0707@gmail.com", "Hi I am Nikhil", "I have Send Mail");
	}
}
