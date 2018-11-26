package it.gportiero.fabrick.model.payments;

import com.fasterxml.jackson.annotation.JsonCreator;

import it.gportiero.fabrick.util.EnumUtils;

/**
 * Fee type of the SCT Transfer
 * 
 * @author gaetano.portiero
 *
 */
public enum FeeType {
	/**
	 * Shared fees
	 */
	SHA,

	/**
	 * Fees apply to payer
	 */
	OUR,

	/**
	 * Fees apply to receiver
	 */
	BEN;

	/**
	 * @param name
	 *            the name of enum
	 * @return an instance of Enum or null if the enum name is not present
	 */
	@JsonCreator
	public static FeeType fromString(String name) {
		return EnumUtils.get(FeeType.class, name);
	}
}
