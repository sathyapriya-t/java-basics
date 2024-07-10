package com.exception;

class AmountValue {

	private String currency;
	private Integer amount;

	public AmountValue(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	// If it is checked exception we have to throw it
	public void add(AmountValue amount1) throws Exception, CurrencyDoNotMatchException {
		if (!this.currency.equals(amount1.currency)) {

			// Throwing Custom Exception
			throw new CurrencyDoNotMatchException(
					"Currency is not Equal" + " " + this.currency + " and " + amount1.currency);
		}
		this.amount = this.amount + amount1.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
}

class CurrencyDoNotMatchException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CurrencyDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingCustomExceptionImpl {

	public static void main(String[] args) throws Exception, CurrencyDoNotMatchException {
		AmountValue amount = new AmountValue("USD", 12);
		AmountValue amount1 = new AmountValue("INR", 12);

		// Here either we can throw exception in declaration or handle it
		amount.add(amount1);
		System.out.println(amount);
	}

}
