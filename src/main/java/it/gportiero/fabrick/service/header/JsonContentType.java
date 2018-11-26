package it.gportiero.fabrick.service.header;

import org.springframework.http.MediaType;

import it.gportiero.fabrick.service.header.interceptor.HeaderInterceptor;

/**
 * Implementation of Header JSON ContentType
 * 
 * @author gaetano.portiero
 *
 */
public class JsonContentType extends HeaderInterceptor {

	/**
	 * Constructor
	 */
	public JsonContentType() {
		super("Content-Type", MediaType.APPLICATION_JSON_VALUE);
	}
}
