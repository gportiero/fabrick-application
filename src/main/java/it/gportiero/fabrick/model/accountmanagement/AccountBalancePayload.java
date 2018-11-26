package it.gportiero.fabrick.model.accountmanagement;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Payload of Account Balance service
 * 
 * @author gaetano.portiero
 *
 */
public class AccountBalancePayload {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate date;
	private String balance;
	private String availableBalance;

	/**
	 * 
	 * @return the reference date for the retrieved balance
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 *            the reference date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * 
	 * @return account balance
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * 
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * 
	 * @return net account balance, without reserved entries
	 */
	public String getAvailableBalance() {
		return availableBalance;
	}

	/**
	 * 
	 * @param availableBalance
	 *            the availableBalance to set
	 */
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
}
