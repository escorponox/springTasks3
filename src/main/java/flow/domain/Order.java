package flow.domain;

import jpa.Customer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	private final BigDecimal PRECIO_BASE        = BigDecimal.valueOf(5L);
	private final int        FREE_INGREDIENTS   = 3;
	private final BigDecimal PRECIO_INGREDIENTE = BigDecimal.valueOf(1L);

	private Customer    customer;
	private List<Pizza> pizzas;
	private Payment     payment;

	public Order() {
		pizzas = new ArrayList<Pizza>();
		customer = new Customer();
		payment = new Payment();
	}

	public void setPaymentAmount() {

		BigDecimal amount = BigDecimal.ZERO;

		for (Pizza pizza : pizzas) {
			amount = amount.add(PRECIO_BASE);
			int additionalIngredients = pizza.ingredients.size() - FREE_INGREDIENTS;
			if (additionalIngredients > 0) {
				amount = amount.add(PRECIO_INGREDIENTE.multiply(BigDecimal.valueOf(additionalIngredients)));
			}
		}

		payment.setAmount(amount);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
