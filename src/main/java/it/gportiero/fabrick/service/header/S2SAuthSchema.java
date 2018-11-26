package it.gportiero.fabrick.service.header;

import it.gportiero.fabrick.service.header.interceptor.HeaderInterceptor;

/**
 * Implementation of Header AuthSchema (S2S)
 * 
 * @author gaetano.portiero
 *
 */
public class S2SAuthSchema extends HeaderInterceptor {

	/**
	 * Constructor
	 */
	public S2SAuthSchema() {
		super("Auth-Schema", "S2S");
	}

}
