package it.gportiero.fabrick.service.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import it.gportiero.fabrick.config.FabrickTestConfig;
import it.gportiero.fabrick.model.accountmanagement.AccountBalanceResponse;
import it.gportiero.fabrick.service.accountmanagement.AccountManagementService;

/**
 * 
 * @author gaetano.portiero
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { FabrickTestConfig.class })
public class AccountManagementServiceImplTest extends AbstractServiceImplTest {

	@Autowired
	private AccountManagementService accountBalanceService;

	@Before
	public void setUp() {
		setRestEndpoint(accountBalanceService);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenMissingAccountId() {
		accountBalanceService.getAccountBalance(null);
	}

	@Test
	public void whenRetrieveAccountBalance() {
		String accountId = generateAccountId();

		AccountBalanceResponse response = accountBalanceService.getAccountBalance(accountId);

		assertTrue(response != null);
	}
}
