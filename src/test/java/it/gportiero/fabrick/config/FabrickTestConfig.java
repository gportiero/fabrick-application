package it.gportiero.fabrick.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import it.gportiero.fabrick.service.accountmanagement.AccountManagementService;
import it.gportiero.fabrick.service.accountmanagement.AccountManagementServiceImpl;
import it.gportiero.fabrick.service.payments.PaymentsService;
import it.gportiero.fabrick.service.payments.PaymentsServiceImpl;

/**
 * 
 * @author gaetano.portiero
 *
 */
@TestConfiguration
public class FabrickTestConfig {
	@Bean
	public RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

		return new RestTemplate(requestFactory);
	}

	@Bean
	public AccountManagementService accountBalanceService() {
		return new AccountManagementServiceImpl();
	}

	@Bean
	public PaymentsService paymentsService() {
		return new PaymentsServiceImpl();
	}
}
