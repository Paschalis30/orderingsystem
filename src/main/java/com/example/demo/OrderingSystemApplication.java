package com.example.demo;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@SpringBootApplication
public class OrderingSystemApplication implements CommandLineRunner{
	 @Autowired
	    private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(OrderingSystemApplication.class, args);
	}
	 @Override
	    public void run(String... args) {

	        System.out.println("Sending Email...");

	        
//	            sendEmailWithAttachment();

	        System.out.println("Done");

	    }

//	    void sendEmail() {
//
//	        SimpleMailMessage msg = new SimpleMailMessage();
//	        msg.setTo("daiannaki26.agui@hotmail.com");
//
//	        msg.setSubject("Arxigos meet");
//	        msg.setText("Anakirixthikes arxigos meet");
//
//	        javaMailSender.send(msg);
//
//	    }

//	    void sendEmailWithAttachment() throws MessagingException, IOException {
//
//	        MimeMessage msg = javaMailSender.createMimeMessage();
//
//	        // true = multipart message
//	        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//	        helper.setTo("1@gmail.com");
//
//	        helper.setSubject("Testing from Spring Boot");
//
//	        // default = text/plain
//	        //helper.setText("Check attachment for image!");
//
//	        // true = text/html
//	        helper.setText("<h1>Check attachment for image!</h1>", true);
//
//	        helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));
//
//	        javaMailSender.send(msg);
//
//	    }
}
