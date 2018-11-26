package it.gportiero.fabrick.service.accountmanagement;

import it.gportiero.fabrick.model.accountmanagement.AccountBalanceResponse;

/**
 * Cash Account Management
 * 
 * @author gaetano.portiero
 *
 */
public interface AccountManagementService {
	/**
	 * Retrieves the balance of a cash account
	 * 
	 * @param accountId
	 *            The ID of the account
	 * @return the balance of a cash account
	 */
	AccountBalanceResponse getAccountBalance(String accountId);
}
