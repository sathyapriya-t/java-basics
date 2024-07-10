package com.exception;

class Amount {

	private String currency;
	private Integer amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	// If it is unchecked exception we have to throw it
	public void add(Amount that) throws Exception {
		if (!this.currency.equals(that.currency)) {

			// Throwing Exception
			throw new Exception("Currency is not Equal" + " " + this.currency + " and " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
}

public class ThrowingException {

	public static void main(String[] args) throws Exception {
		Amount amount = new Amount("USD", 12);
		Amount amount1 = new Amount("INR", 12);

		// Here either we can throw exception in declaration or handle it
		amount.add(amount1);
		System.out.println(amount);
	}

}
