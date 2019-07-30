package com.vininavarini.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.vininavarini.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
