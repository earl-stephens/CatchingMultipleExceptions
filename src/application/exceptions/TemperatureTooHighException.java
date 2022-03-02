package application.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeException {
	public TemperatureTooHighException(String message) {
		super(message);
	}
}
