package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {
	
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(50);
		} catch(TemperatureTooLowException|TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			//This will catch any other exceptions, but it must be the last
			//catch block since it's a super class
		}
			/*
		} catch (TemperatureTooHighException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (TemperatureTooLowException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		* can replace the two catches with one, since both
		 * exceptions have a parent class:
		 *  catch (TemperatureOutOfRangeException e) {
		 *  e.printStackTrace();
		 *  }
		 */
	}
}
