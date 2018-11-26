package it.gportiero.fabrick.model.payments;

/**
 * Fee object, describing the applied fees to the SCT Transfer.
 * 
 * @author gaetano.portiero
 *
 */
public class Fee {
	private String amount;
	private Currency currency;
	private String code;
	private String description;

	/**
	 * 
	 * @return The amount of the applied fee
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * 
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * 
	 * @return The currency of the applied fee
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * 
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * 
	 * @return The code of the applied fee
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @return The textual description of the applied fee
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
