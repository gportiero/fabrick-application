package it.gportiero.fabrick.model.payments;

import java.util.List;

import it.gportiero.fabrick.model.Response;

/**
 * Response of Create SCT Order service
 * 
 * @author gaetano.portiero
 *
 */
public class CreateSCTOrderResponse extends Response {
	private List<CreateSCTOrderPayload> payload;

	/**
	 * 
	 * @return the payload
	 */
	public List<CreateSCTOrderPayload> getPayload() {
		return payload;
	}

	/**
	 * 
	 * @param payload
	 *            the payload to set
	 */
	public void setPayload(List<CreateSCTOrderPayload> payload) {
		this.payload = payload;
	}
}
