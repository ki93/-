package com.manage.system.service;

import java.util.Date;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.manage.system.dto.MailDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MailService {
	
	private final JavaMailSender javaMailSender;
	private static final String FROM_ADDRESS = "kiih0093@gmail.com";
	
	public void mailSend(MailDTO mailDTO) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mailDTO.getAddress());
		message.setFrom(FROM_ADDRESS);
		message.setSubject(mailDTO.getTitle());
		message.setText(mailDTO.getMessage());
		message.setSentDate(new Date());
		javaMailSender.send(message);
	}
	

}
