package it.gportiero.fabrick.service;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import it.gportiero.fabrick.service.header.JsonContentType;
import it.gportiero.fabrick.service.header.S2SAuthSchema;

/**
 * Abstract class to manage call to RestTemplate
 * 
 * @author gaetano.portiero
 *
 */
public abstract class AbstractService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${rest.base.url}")
	private String restBaseUrl;

	private <T> T perform(String serviceUrl, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType) {
		checkIfNull(serviceUrl, "serviceUrl");

		if (!serviceUrl.startsWith("/")) {
			serviceUrl = "/" + serviceUrl;
		}

		// get headers
		List<ClientHttpRequestInterceptor> headers = getHeaders();

		if (headers != null) {
			restTemplate.setInterceptors(headers);
		}

		// compose final URL
		String url = restBaseUrl + serviceUrl;

		ResponseEntity<T> exchange = restTemplate.exchange(url, method, requestEntity, responseType);
		
		return exchange.getBody();
	}

	/**
	 * Convenience method to perform GET operation
	 * 
	 * @param serviceUrl
	 *            the serviceUrl
	 * @param responseType
	 *            the response type
	 * @return the response of GET operation
	 */
	public <T> T doGet(String serviceUrl, Class<T> responseType) {
		return perform(serviceUrl, HttpMethod.GET, null, responseType);
	}

	/**
	 * Convenience method to perform POST operation
	 * 
	 * @param serviceUrl
	 *            the serviceUrl
	 * @param entity
	 *            the input entity for the POST operation
	 * @param responseType
	 *            the response type
	 * @return the response of POST operation
	 */
	public <T> T doPost(String serviceUrl, HttpEntity<?> entity, Class<T> responseType) {
		return perform(serviceUrl, HttpMethod.POST, entity, responseType);
	}

	/**
	 * Throws an {@link IllegalArgumentException} if the object is null.
	 * 
	 * @param object
	 *            the object to check
	 * @param fieldName
	 *            the name of the object
	 */
	public final void checkIfNull(Object object, String fieldName) {
		if (object == null) {
			throw new IllegalArgumentException(
					format("The supplied [%s] is required and must not be null.", fieldName));
		}
	}

	/**
	 * Define the method used to retrieve the headers. Your implementation can
	 * override this method to set header list
	 * 
	 * @return the list of headers
	 */
	protected List<ClientHttpRequestInterceptor> getHeaders() {
		List<ClientHttpRequestInterceptor> headers = new ArrayList<ClientHttpRequestInterceptor>();
		headers.add(new JsonContentType());
		headers.add(new S2SAuthSchema());

		return headers;
	}
}
