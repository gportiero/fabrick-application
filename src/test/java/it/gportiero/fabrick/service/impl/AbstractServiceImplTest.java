package it.gportiero.fabrick.service.impl;

import java.util.UUID;

import org.springframework.test.util.ReflectionTestUtils;

/**
 * 
 * @author gaetano.portiero
 *
 */
public class AbstractServiceImplTest {
	protected void setRestEndpoint(Object targetObject) {
		ReflectionTestUtils.setField(targetObject, "restBaseUrl", "https://sandbox.platfr.io");	
	}
	
	protected String generateAccountId() {
		return UUID.randomUUID().toString();
	}
}
