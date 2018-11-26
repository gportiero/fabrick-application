/**
 * 
 */
package it.gportiero.fabrick.model.payments;

import com.fasterxml.jackson.annotation.JsonCreator;

import it.gportiero.fabrick.util.EnumUtils;

/**
 * The currency
 * 
 * @author gaetano.portiero
 *
 */
public enum Currency {
	/**
	 * Euro
	 */
	EUR;

	/**
	 * @param name
	 *            the name of enum
	 * @return an instance of Enum or null if the enum name is not present
	 */
	@JsonCreator
	public static Currency fromString(String name) {
		return EnumUtils.get(Currency.class, name);
	}
}
