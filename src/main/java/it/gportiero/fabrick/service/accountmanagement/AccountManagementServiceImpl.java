package it.gportiero.fabrick.service.accountmanagement;

import static java.lang.String.format;

import it.gportiero.fabrick.model.accountmanagement.AccountBalanceResponse;
import it.gportiero.fabrick.service.AbstractService;

/**
 * Implementation class of Account Management services
 * 
 * @author gaetano.portiero
 *
 */
public class AccountManagementServiceImpl extends AbstractService implements AccountManagementService {

	@Override
	public AccountBalanceResponse getAccountBalance(String accountId) {
		checkIfNull(accountId, "accountId");

		// compose service url
		String serviceUrl = format("/api/gbs/banking/v2/accounts/%s/balance", accountId);

		return doGet(serviceUrl, AccountBalanceResponse.class);
	}
}
