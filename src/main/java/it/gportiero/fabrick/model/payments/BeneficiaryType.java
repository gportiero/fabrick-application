package it.gportiero.fabrick.model.payments;

import com.fasterxml.jackson.annotation.JsonCreator;

import it.gportiero.fabrick.util.EnumUtils;

/**
 * The type of the tax relief beneficiary
 * 
 * @author gaetano.portiero
 *
 */
public enum BeneficiaryType {
	/**
	 * If the beneficiary is a natural person
	 */
	NATURAL_PERSON,

	/**
	 * If the beneficiary is a legal person
	 */
	LEGAL_PERSON;

	/**
	 * @param name
	 *            the name of enum
	 * @return an instance of Enum or null if the enum name is not present
	 */
	@JsonCreator
	public static BeneficiaryType fromString(String name) {
		return EnumUtils.get(BeneficiaryType.class, name);
	}
}
