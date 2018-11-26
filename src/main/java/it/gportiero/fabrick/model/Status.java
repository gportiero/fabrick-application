package it.gportiero.fabrick.model;

/**
 * Status class
 * 
 * @author gaetano.portiero
 *
 */
public class Status {
	private Code code;
	private String description;

	/**
	 * 
	 * @return the code of the response
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(Code code) {
		this.code = code;
	}

	/**
	 * 
	 * @return the description of the response
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
