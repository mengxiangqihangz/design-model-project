package net.dp.observer.demo1;

public interface Observer {
	void update(float temp,float humidity, float pressure);
	void display();
}
