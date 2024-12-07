package com.example.medical_system_backend;



	import jakarta.persistence.*;

	@Entity
	public class PaymentRepository {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String orderId;
	    private String status;
	    private String paymentId;
	    private String amount;
	    private String currency;

	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getOrderId() { return orderId; }
	    public void setOrderId(String orderId) { this.orderId = orderId; }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }

	    public String getPaymentId() { return paymentId; }
	    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

	    public String getAmount() { return amount; }
	    public void setAmount(String amount) { this.amount = amount; }

	    public String getCurrency() { return currency; }
	    public void setCurrency(String currency) { this.currency = currency; }
	}



