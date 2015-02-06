package flow.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Payment implements Serializable {

	PaymentType paymentType;
	BigDecimal amount;

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
