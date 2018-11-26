package it.gportiero.fabrick.model;

/**
 * 
 * This class manage the generic response present for each response of services
 * 
 * @author gaetano.portiero
 *
 */
public class Response {
	private Status status;
	private Error error;

	/**
	 * 
	 * @return the status of the response
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * 
	 * @return the error of the response
	 */
	public Error getError() {
		return error;
	}

	/**
	 * 
	 * @param error
	 *            the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}
}
