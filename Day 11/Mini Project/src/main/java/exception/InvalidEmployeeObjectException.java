package exception;

import util.ApplicationProperties;

public class InvalidEmployeeObjectException extends Exception {
	
	@Override
	public String toString() {
		return ApplicationProperties.validationFailed;
	}
}
