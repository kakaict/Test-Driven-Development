package com;

public class Euro {
	
	//kakaict added
	
	private double  amount;
	
	private static final int CENTS_PER_EURO = 100;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Euro(double amount){
		checkNegativeNumber(amount);
		this.amount = amount;
	}

	private void checkNegativeNumber(double amount) {
		if (amount < 0){
			throw new IllegalArgumentException("Negative number");
		}
	}
	
	@Override
	public String toString(){
		return String.format("%.2f EURO", amount) ;
	}
	
	@Override
	public boolean equals(Object euro){
		if (euro == null)
			return false;
		else {
			return (euro instanceof Euro) && (this.getAmount() == ((Euro)euro).getAmount());
		}
	}
	
	private double getAmountInCent(){
		return amount * 100;
	}

	public Euro subtract(Euro euro) {
		return new Euro((this.getAmountInCent() - euro.getAmountInCent())/CENTS_PER_EURO);
	}

	public Euro add(Euro euro) {
		return new Euro((this.getAmountInCent() + euro.getAmountInCent())/CENTS_PER_EURO);
	}
	

}
