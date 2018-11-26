package it.gportiero.fabrick.model.payments;

/**
 * This class contains the optional tax relief information. These information
 * are specific for the Italian regulation
 * 
 * @author gaetano.portiero
 *
 */
public class TaxRelief {
	private TaxReliefId taxReliefId;
	private String description;
	private String receiverFiscalCode;
	private BeneficiaryType beneficiaryType;
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
	private LegalPersonBeneficiary legalPersonBeneficiary;

	/**
	 * @return The ID of the tax relief
	 */
	public TaxReliefId getTaxReliefId() {
		return taxReliefId;
	}

	/**
	 * @param taxReliefId
	 *            the taxReliefId to set
	 */
	public void setTaxReliefId(TaxReliefId taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	/**
	 * @return The description of the tax relief
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return The fiscal code (either the Italian Codice Fiscale or Partita IVA) of
	 *         the SCT transfer receiver
	 */
	public String getReceiverFiscalCode() {
		return receiverFiscalCode;
	}

	/**
	 * @param receiverFiscalCode
	 *            the receiverFiscalCode to set
	 */
	public void setReceiverFiscalCode(String receiverFiscalCode) {
		this.receiverFiscalCode = receiverFiscalCode;
	}

	/**
	 * @return The type of the tax relief beneficiary
	 */
	public BeneficiaryType getBeneficiaryType() {
		return beneficiaryType;
	}

	/**
	 * @param beneficiaryType
	 *            the beneficiaryType to set
	 */
	public void setBeneficiaryType(BeneficiaryType beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	/**
	 * @return The list of Italian Codice Fiscale related to the natural person
	 *         beneficiary/beneficiaries of the tax relief.
	 */
	public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
		return naturalPersonBeneficiary;
	}

	/**
	 * @param naturalPersonBeneficiary
	 *            the naturalPersonBeneficiary to set
	 */
	public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	/**
	 * @return The information of the legal person beneficiary of the tax relief
	 */
	public LegalPersonBeneficiary getLegalPersonBeneficiary() {
		return legalPersonBeneficiary;
	}

	/**
	 * @param legalPersonBeneficiary
	 *            the legalPersonBeneficiary to set
	 */
	public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}
}
