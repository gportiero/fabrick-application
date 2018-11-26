package it.gportiero.fabrick.service.header.interceptor;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * Implementation of Header interceptor. Used to set custom header
 * 
 * @author gaetano.portiero
 *
 */
public class HeaderInterceptor implements ClientHttpRequestInterceptor {

	private String name;
	private String value;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            the header name
	 * @param value
	 *            the value header
	 */
	public HeaderInterceptor(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		request.getHeaders().set(name, value);
		return execution.execute(request, body);
	}
}
