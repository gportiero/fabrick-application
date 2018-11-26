package it.gportiero.fabrick.service.payments;

import static java.lang.String.format;

import org.springframework.http.HttpEntity;

import it.gportiero.fabrick.model.payments.CreateSCTOrderRequest;
import it.gportiero.fabrick.model.payments.CreateSCTOrderResponse;
import it.gportiero.fabrick.service.AbstractService;

/**
 * Implementation class of Payments services
 * 
 * @author gaetano.portiero
 *
 */
public class PaymentsServiceImpl extends AbstractService implements PaymentsService {

	@Override
	public CreateSCTOrderResponse createSCTOrder(String accountId, CreateSCTOrderRequest body) {
		checkIfNull(accountId, "accountId");
		checkIfNull(body, "body");

		// compose service url
		String serviceUrl = format("/api/gbs/banking/v2.1/accounts/%s/payments/sct/orders", accountId);

		return doPost(serviceUrl, new HttpEntity<CreateSCTOrderRequest>(body), CreateSCTOrderResponse.class);
	}
}
