package it.gportiero.fabrick.model.accountmanagement;

import java.util.List;

import it.gportiero.fabrick.model.Response;

/**
 * This class manage the response for the service Account Balance
 * 
 * @author gaetano.portiero
 *
 */
public class AccountBalanceResponse extends Response {
	private List<AccountBalancePayload> payload;

	/**
	 * 
	 * @return the balance of cash account
	 */
	public List<AccountBalancePayload> getPayload() {
		return payload;
	}

	/**
	 * 
	 * @param payload
	 *            the payload to set
	 */
	public void setPayload(List<AccountBalancePayload> payload) {
		this.payload = payload;
	}
}
