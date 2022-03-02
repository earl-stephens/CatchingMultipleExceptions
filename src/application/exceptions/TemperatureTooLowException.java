package application.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {
	public TemperatureTooLowException(String message) {
		super(message);
	}
}
