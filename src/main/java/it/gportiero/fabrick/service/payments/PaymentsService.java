package it.gportiero.fabrick.service.payments;

import it.gportiero.fabrick.model.payments.CreateSCTOrderRequest;
import it.gportiero.fabrick.model.payments.CreateSCTOrderResponse;

/**
 * 
 * Payments/SCT - SEPA Credit Transfer
 * 
 * @author gaetano.portiero
 *
 */
public interface PaymentsService {
	/**
	 * Creates a SCT payment order
	 * 
	 * @param accountId
	 *            The ID of the account
	 * @param request
	 *            the request
	 * @return the payment order
	 */
	CreateSCTOrderResponse createSCTOrder(String accountId, CreateSCTOrderRequest request);
}
