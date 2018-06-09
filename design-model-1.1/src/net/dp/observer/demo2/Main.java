package net.dp.observer.demo2;

import net.dp.observer.demo2.impl.CurrentConditionsDisplay;
import net.dp.observer.demo2.impl.ForecastDisplay;
import net.dp.observer.demo2.impl.HeatIndexDisplay;
import net.dp.observer.demo2.impl.StatisticsDisplay;
import net.dp.observer.demo2.impl.WeatherData;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("======================");
//		weatherData.setMeasurements(82, 70, 29.2f);
//		System.out.println("======================");
//		weatherData.setMeasurements(78, 90, 29.2f);
	}
}