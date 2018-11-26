package it.gportiero.fabrick.model.payments;

import com.fasterxml.jackson.annotation.JsonCreator;

import it.gportiero.fabrick.util.EnumUtils;

/**
 * The ID of the tax relief
 * 
 * @author gaetano.portiero
 *
 */
public enum TaxReliefId {
	/**
	 * Interventi antisismici
	 */
	DL50,

	/**
	 * Bonus verde
	 */
	L112,

	/**
	 * Acquisto mobilio prima casa giovani coppie
	 */
	L208,

	/**
	 * Acquisto mobilio per ristrutturazione
	 */
	L090,

	/**
	 * Risparmio energetico
	 */
	L296,

	/**
	 * Ristrutturazione
	 */
	L449;

	/**
	 * @param name
	 *            the name of enum
	 * @return an instance of Enum or null if the enum name is not present
	 */
	@JsonCreator
	public static TaxReliefId fromString(String name) {
		return EnumUtils.get(TaxReliefId.class, name);
	}
}
