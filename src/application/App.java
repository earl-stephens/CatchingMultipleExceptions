package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {
	
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(50);
		} catch (TemperatureTooHighException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (TemperatureTooLowException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}
}
