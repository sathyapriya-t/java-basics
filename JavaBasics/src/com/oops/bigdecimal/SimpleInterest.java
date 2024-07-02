package com.oops.bigdecimal;

import java.math.BigDecimal;

public class SimpleInterest {
	
	private BigDecimal pricipal;
	private BigDecimal interest;

	public BigDecimal getPricipal() {
		return pricipal;
	}

	public void setPricipal(BigDecimal pricipal) {
		this.pricipal = pricipal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}


	public SimpleInterest(String pricipal, String interest) {
		this.pricipal = new BigDecimal(pricipal);
		this.interest = new BigDecimal(interest);
		
	}
	public BigDecimal calculateTotalValue(int years) {
		
		BigDecimal total = getPricipal().add(getPricipal().multiply(getInterest()).multiply(new BigDecimal(years)));
		return total;
		
	}

}
