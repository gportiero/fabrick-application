package it.gportiero.fabrick.model.payments;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * Request of Create SCT Order
 * 
 * @author gaetano.portiero
 *
 */
public class CreateSCTOrderRequest {
	private String receiverIban;
	private String receiverBic;
	private String receiverSwift;
	private String receiverName;
	private String description;
	private String amount;
	private Currency currency;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate executionDate;
	private Boolean urgent;
	private Boolean instant;
	private FeeType feeType;
	private String receiverAddress;
	private String receiverCity;
	private String receiverCountry;
	private TaxRelief taxRelief;

	/**
	 * The constructor
	 * 
	 * @param receiverName
	 *            The name and surname of the receiver
	 * @param description
	 *            The textual description of the SCT Transfer
	 * @param amount
	 *            The amount of money to be transferred
	 * @param currency
	 *            The currency of the SCT Transfer. Please note that this is the
	 *            currency that will be used to credit the receiver with the
	 *            specified amount of money. If the account from which the SCT
	 *            Transfer is ordered has a different currency, additional currency
	 *            conversion fees may apply
	 * @param executionDate
	 *            The execution date of the SCT transfer
	 * @param feeType
	 *            Fee type for the SCT Transfer
	 */
	public CreateSCTOrderRequest(String receiverName, String description, String amount, Currency currency,
			LocalDate executionDate, FeeType feeType) {
		this.receiverName = receiverName;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
		this.executionDate = executionDate;
		this.feeType = feeType;
	}

	/**
	 * @return The IBAN of the receiver
	 */
	public String getReceiverIban() {
		return receiverIban;
	}

	/**
	 * @param receiverIban
	 *            the receiverIban to set
	 */
	public void setReceiverIban(String receiverIban) {
		this.receiverIban = receiverIban;
	}

	/**
	 * @return The BIC code of the receiver
	 */
	public String getReceiverBic() {
		return receiverBic;
	}

	/**
	 * @param receiverBic
	 *            the receiverBic to set
	 */
	public void setReceiverBic(String receiverBic) {
		this.receiverBic = receiverBic;
	}

	/**
	 * @return The SWIFT code of the receiver
	 */
	public String getReceiverSwift() {
		return receiverSwift;
	}

	/**
	 * @param receiverSwift
	 *            the receiverSwift to set
	 */
	public void setReceiverSwift(String receiverSwift) {
		this.receiverSwift = receiverSwift;
	}

	/**
	 * @return The name and surname of the receiver
	 */
	public String getReceiverName() {
		return receiverName;
	}

	/**
	 * @param receiverName
	 *            the receiverName to set
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	/**
	 * @return The textual description of the SCT Transfer
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return The amount of money to be transferred
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return The currency of the SCT Transfer. Please note that this is the
	 *         currency that will be used to credit the receiver with the specified
	 *         amount of money. If the account from which the SCT Transfer is
	 *         ordered has a different currency, additional currency conversion fees
	 *         may apply.
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return The execution date of the SCT transfer
	 */
	public LocalDate getExecutionDate() {
		return executionDate;
	}

	/**
	 * @param executionDate
	 *            the executionDate to set
	 */
	public void setExecutionDate(LocalDate executionDate) {
		this.executionDate = executionDate;
	}

	/**
	 * @return The Flag to set money transfer as urgent. Please note that additional
	 *         fees may apply for urgent money transfers
	 */
	public Boolean getUrgent() {
		return urgent;
	}

	/**
	 * @param urgent
	 *            the urgent to set
	 */
	public void setUrgent(Boolean urgent) {
		this.urgent = urgent;
	}

	/**
	 * @return The Flag to set money transfer as instant (SCT-Inst). Please note
	 *         that additional fees may apply for SCT-Inst money transfers
	 */
	public Boolean getInstant() {
		return instant;
	}

	/**
	 * @param instant
	 *            the instant to set
	 */
	public void setInstant(Boolean instant) {
		this.instant = instant;
	}

	/**
	 * @return The Fee type for the SCT Transfer
	 */
	public FeeType getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType
	 *            the feeType to set
	 */
	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	/**
	 * @return The physical address of the receiver
	 */
	public String getReceiverAddress() {
		return receiverAddress;
	}

	/**
	 * @param receiverAddress
	 *            the receiverAddress to set
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	/**
	 * @return The city of the receiver
	 */
	public String getReceiverCity() {
		return receiverCity;
	}

	/**
	 * @param receiverCity
	 *            the receiverCity to set
	 */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	/**
	 * @return The country code of the receiver, formatted using ISO 3166-1 alpha-2
	 *         standard
	 */
	public String getReceiverCountry() {
		return receiverCountry;
	}

	/**
	 * @param receiverCountry
	 *            the receiverCountry to set
	 */
	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}

	/**
	 * @return The optional tax relief information. These information are specific
	 *         for the Italian regulation.
	 */
	public TaxRelief getTaxRelief() {
		return taxRelief;
	}

	/**
	 * @param taxRelief
	 *            the taxRelief to set
	 */
	public void setTaxRelief(TaxRelief taxRelief) {
		this.taxRelief = taxRelief;
	}
}
