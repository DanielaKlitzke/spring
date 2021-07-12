package com.daniela.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.daniela.cursomc.domain.Cliente;
import com.daniela.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
