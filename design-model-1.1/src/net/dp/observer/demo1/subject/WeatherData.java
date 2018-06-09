package net.dp.observer.demo1.subject;

import java.util.ArrayList;

import net.dp.observer.demo1.Observer;

public class WeatherData{

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	// other WeatherData methods here

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
	public ArrayList<Observer> observers;

	
//	public void notifyObservers() {
//		for (int i = 0; i < observers.size(); i++) {
//			Observer observer = (Observer) observers.get(i);
//			observer.update(this);
//		}
//	}


	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
}