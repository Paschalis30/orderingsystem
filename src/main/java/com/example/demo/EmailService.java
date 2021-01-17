//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    private JavaMailSender javaMailSender;
//
//    @Autowired
//    public EmailService(JavaMailSender javaMailSender){
//        this.javaMailSender = javaMailSender;
//    }
//
//    public void sendEmail(Email email) throws MailException {
//        SimpleMailMessage mail = new SimpleMailMessage();
//        mail.setTo("marioluarca7@gmail.com");
//        mail.setFrom(email.getEmail());
//        mail.setSubject("Contacto: "+email.getNombre());
//        mail.setText(email.getMensaje());
//
//        javaMailSender.send(mail);
//    }
//
//}