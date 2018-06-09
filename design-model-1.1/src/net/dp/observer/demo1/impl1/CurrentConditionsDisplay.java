package net.dp.observer.demo1.impl1;

import net.dp.observer.demo1.Observer;
import net.dp.observer.demo1.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer    
{
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
}