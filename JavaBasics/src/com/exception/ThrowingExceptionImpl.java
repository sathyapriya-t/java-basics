package com.exception;

class Amount {

	private String currency;
	private Integer amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) {
		if (!this.currency.equals(that.currency)) {

			// Throwing Exception
			throw new RuntimeException("Currency is not Equal");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
}

public class ThrowingExceptionImpl {

	public static void main(String[] args) {
		Amount amount = new Amount("USD", 12);
		Amount amount1 = new Amount("INR", 12);
		amount.add(amount1);
		System.out.println(amount);
	}

}
