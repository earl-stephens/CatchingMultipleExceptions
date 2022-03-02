package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;
import application.exceptions.TemperatureOutOfRangeException;

public class Thermostat {
	public void setTemperature (double temperature) throws TemperatureTooLowException, TemperatureTooHighException {
		setMachineTemperature(temperature);
		System.out.println("Setting temperature to " + temperature);
	}

	public void setMachineTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException {
		if(temperature < 0) {
			throw new TemperatureTooLowException("Temperature is too low");
		} else if(temperature > 35) {
			throw new TemperatureTooHighException("Temperature is too high");
		}
	}
}
