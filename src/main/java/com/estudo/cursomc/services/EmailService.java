package com.estudo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.estudo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
