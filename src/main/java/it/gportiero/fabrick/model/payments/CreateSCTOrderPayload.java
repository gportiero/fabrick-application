package it.gportiero.fabrick.model.payments;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * Payload of Create SCT Order service
 * 
 * @author gaetano.portiero
 *
 */
public class CreateSCTOrderPayload {
	private String orderId;
	private String cro;
	private String uri;
	private Amount amount;
	private FeeType feeType;
	private List<Fee> fees;
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate date;
	private TaxRelief taxRelief;

	/**
	 * @return The ID of the SCT Transfer
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return The Confirmation Request Order (CRO) identifier of the SCT Transfer
	 */
	public String getCro() {
		return cro;
	}

	/**
	 * @param cro
	 *            the cro to set
	 */
	public void setCro(String cro) {
		this.cro = cro;
	}

	/**
	 * @return The Uniform Resource Identifier (URI) identifier of the SCT Transfer
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return The amount data
	 */
	public Amount getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	/**
	 * @return The Fee type of the SCT Transfer
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
	 * @return The list of Fee objects, describing the applied fees to the SCT
	 *         Transfer.
	 */
	public List<Fee> getFees() {
		return fees;
	}

	/**
	 * @param fees
	 *            the fees to set
	 */
	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	/**
	 * @return The execution date of the SCT transfer
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return The optional tax relief information. These information are specific
	 *         for the Italian regulation
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
