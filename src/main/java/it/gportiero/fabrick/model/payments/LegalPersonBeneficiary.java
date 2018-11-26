package it.gportiero.fabrick.model.payments;

/**
 * This class contains the information of the legal person beneficiary of the
 * tax relief.
 * 
 * @author gaetano.portiero
 *
 */
public class LegalPersonBeneficiary {
	private String fiscalCode;
	private String legalRepresentativeFiscalCode;

	/**
	 * 
	 * @return The Italian fiscal code (Partita IVA) of the legal person
	 */
	public String getFiscalCode() {
		return fiscalCode;
	}

	/**
	 * 
	 * @param fiscalCode
	 *            the fiscalCode to set
	 */
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	/**
	 * 
	 * @return The Italian fiscal code (Codice Fiscale) of the legal representative
	 *         of the legal person
	 */
	public String getLegalRepresentativeFiscalCode() {
		return legalRepresentativeFiscalCode;
	}

	/**
	 * 
	 * @param legalRepresentativeFiscalCode
	 *            the legalRepresentativeFiscalCode to set
	 */
	public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}
}
