package it.gportiero.fabrick.service.impl;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import it.gportiero.fabrick.config.FabrickTestConfig;
import it.gportiero.fabrick.model.Code;
import it.gportiero.fabrick.model.payments.CreateSCTOrderRequest;
import it.gportiero.fabrick.model.payments.CreateSCTOrderResponse;
import it.gportiero.fabrick.model.payments.Currency;
import it.gportiero.fabrick.model.payments.FeeType;
import it.gportiero.fabrick.service.payments.PaymentsService;

/**
 * 
 * @author gaetano.portiero
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { FabrickTestConfig.class })
public class PaymentsServiceImplTest extends AbstractServiceImplTest {

	@Autowired
	private PaymentsService paymentsService;

	@Before
	public void setUp() {
		setRestEndpoint(paymentsService);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenMissingAccountId() {
		paymentsService.createSCTOrder(null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenMissingBody() {
		paymentsService.createSCTOrder("XXXX", null);
	}

	@Test
	public void whenCreateSCTOrder() {
		String accountId = generateAccountId();
		
		CreateSCTOrderRequest body = new CreateSCTOrderRequest("Receiver name", "Description", "100", Currency.EUR,
				LocalDate.now(), FeeType.SHA);

		CreateSCTOrderResponse createSCTOrder = paymentsService.createSCTOrder(accountId, body);

		assertTrue(createSCTOrder != null);
		assertTrue(Code.OK == createSCTOrder.getStatus().getCode());
	}
}
