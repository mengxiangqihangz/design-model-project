

package net.dp.observer.demo1_bak.impl1;

import net.dp.observer.demo1.Observer;
import net.dp.observer.demo1.subject.WeatherData;
import net.dp.observer.demo1_bak.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;

	public StatisticsDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = "
				+ (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}