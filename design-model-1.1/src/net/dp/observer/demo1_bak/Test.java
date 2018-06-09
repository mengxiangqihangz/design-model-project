package net.dp.observer.demo1_bak;

import net.dp.observer.demo1.impl1.CurrentConditionsDisplay;
import net.dp.observer.demo1.impl1.ForecastDisplay;
import net.dp.observer.demo1.impl1.HeatIndexDisplay;
import net.dp.observer.demo1.impl1.StatisticsDisplay;
import net.dp.observer.demo1.subject.WeatherData;


public class Test {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);
		new StatisticsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("======================");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("======================");
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}