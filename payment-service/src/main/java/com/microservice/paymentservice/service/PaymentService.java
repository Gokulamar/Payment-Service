package com.microservice.paymentservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}


	public String paymentProcessing() {
		return new Random().nextBoolean() ? "Success" : "Failure" ;
	}


	public Payment findPaymentHistoryByOrderId(int orderId) {
		return paymentRepository.findByOrderId(orderId);
	}


}
