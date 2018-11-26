package it.gportiero.fabrick.model.payments;

/**
 * Amount class
 * 
 * @author gaetano.portiero
 *
 */
public class Amount {
	private String receiverAmount;
	private Currency receiverCurrency;
	private String exchangeRate;

	/**
	 * @return the receiverAmount
	 */
	public String getReceiverAmount() {
		return receiverAmount;
	}

	/**
	 * @param receiverAmount
	 *            the receiverAmount to set
	 */
	public void setReceiverAmount(String receiverAmount) {
		this.receiverAmount = receiverAmount;
	}

	/**
	 * @return the receiverCurrency
	 */
	public Currency getReceiverCurrency() {
		return receiverCurrency;
	}

	/**
	 * @param receiverCurrency
	 *            the receiverCurrency to set
	 */
	public void setReceiverCurrency(Currency receiverCurrency) {
		this.receiverCurrency = receiverCurrency;
	}

	/**
	 * @return the exchangeRate
	 */
	public String getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate
	 *            the exchangeRate to set
	 */
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
