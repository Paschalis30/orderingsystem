package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

@CrossOrigin(origins="*",allowedHeaders={"*"})
@RestController
public class SpringController {
	
	
	
	
	
	
	
//	private void sendmail() throws AddressException, MessagingException, IOException {
//		   Properties props = new Properties();
//		   props.put("mail.smtp.auth", "true");
//		   props.put("mail.smtp.starttls.enable", "true");
//		   props.put("mail.smtp.host", "smtp.gmail.com");
//		   props.put("mail.smtp.port", "587");
//		   
//		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//		      protected PasswordAuthentication getPasswordAuthentication() {
//		         return new PasswordAuthentication("Kitsikoudis.Paschalis90@gmail.com", "kitsikoudisp90");
//		      }
//		   });
//		   Message msg = new MimeMessage(session);
//		   msg.setFrom(new InternetAddress("Kitsikoudis.Paschalis90@gmail.com", false));
//
//		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("Kitsikoudis.Paschalis90@gmail.com"));
//		   msg.setSubject("Tutorials point email");
//		   msg.setContent("Tutorials point email", "text/html");
//		   msg.setSentDate(new Date());
//
//		   MimeBodyPart messageBodyPart = new MimeBodyPart();
//		   messageBodyPart.setContent("Tutorials point email", "text/html");
//
//		   Multipart multipart = new MimeMultipart();
//		   multipart.addBodyPart(messageBodyPart);
//		   MimeBodyPart attachPart = new MimeBodyPart();
//
//		   attachPart.attachFile("C://Users//Paschalis//git//orderingsystem//src//main//java//com//example//demo//Proxeiro.txt");
//		   multipart.addBodyPart(attachPart);
//		   msg.setContent(multipart);
//		   Transport.send(msg);   
//		}
	
	
	
	
	
	
	
	
	
	
	
	@Autowired
	Interface_Drinks drinks;
	@Autowired
	Interface_Salad salad;
	@Autowired
	Interface_Paragelia paragelia;
	@Autowired
	Interface_User user;
	@Autowired
	Interface_Food food;
	 @Autowired
	    private JavaMailSender javaMailSender;
	@Autowired
	Interface_Message mes;
	@JsonIgnore
	@GetMapping("/allsalads")
	public Iterable<Salad> getSalad(){
		return  salad.findAll(); //select * from salad
	}
	
	@JsonIgnore
	@GetMapping("/allParagelies")
	public Iterable<Paragelia> getParagelia(){
		return  paragelia.findAll(); //select * from salad
	}
	
	@JsonIgnore
	@GetMapping({ "/findById/{id}" })
	public List<Salad> findByQty(@PathVariable int id) {
		
		return salad.findById(id);
	}
	
	@JsonIgnore
	@GetMapping({ "/findByName/{name}" })
	public List<Salad> getName(@PathVariable String name) {
		
		return salad.findByName(name);
	}
	
	
//	@GetMapping("/")
//	public String login(){
//		return "authenticated successfully" ;
//	}
	
	
	@JsonIgnore
	@PostMapping("/register")
	public  String User(@RequestBody User User) {
		
		try {
	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo(User.getEmail());

	        msg.setSubject("Thema");
	        msg.setText("Your registration was succesfull "+" Username: "+User.getUsername()+" Email: "+User.getEmail()+" password: "+User.getPassword());

	        javaMailSender.send(msg);}
			catch(Throwable e) {
				
			}
		user.save(User);
		return "User"+" "+User.getUsername()+" ,have successfully submitted";
		
	}
	
	@JsonIgnore
	@GetMapping({ "/User/{username}/{password}/{role}" })
	public List<User> login(@PathVariable String username,@PathVariable int password,@PathVariable String role) {
		
		return user.findByUsernameAndPasswordAndRole(username, password,role);
	}
	
	@JsonIgnore
	@GetMapping("/allusers")
	public Iterable<User> getUsers(){
		return  user.findAll(); //select * from salad
	}
	@JsonIgnore
	@GetMapping({ "/findByUsername/{username}" })
	public List<User> findByUsername(@PathVariable String username) {
		
		return user.findByUsername(username);
	}
	
	@JsonIgnore
@GetMapping("/query/{priceUnit}/{name}")
public List<Object> getStudentBynameOfSubject(@PathVariable double priceUnit,@PathVariable String name){
		
	return salad.findByPriceUnitAndName(priceUnit,name);
}
	
//	@JsonIgnore
//@GetMapping("/query2/{role}")
//public List<Object> getByRole(@PathVariable String role){
//		
//	return salad.findByRole(role);
//}
	  
//	   @RequestMapping(value = "/sendemail")
//	   public String sendEmail() throws AddressException, MessagingException, IOException {
//	      sendmail();
//	      return "Email sent successfully";   
//	   }
//	
	
	@JsonIgnore
@RequestMapping("/sendMessage/{messageText}")
	public String sendEmail(@PathVariable String messageText, Message Message) {
		messageText=Message.messageText;
		mes.save(Message);
		try {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("akitsikoudis@yahoo.gr");

        msg.setSubject("Thema");
        msg.setText(messageText);

        javaMailSender.send(msg);}
		catch(Throwable e) {
			
		}
	
		 
              return "Your email have successfully submited";
    }
	
	@JsonIgnore
	@GetMapping("/getMessage")
	public Iterable<Message> getMessage(){
		return  mes.findAll(); //select * from salad
	}
}
	    
	  
