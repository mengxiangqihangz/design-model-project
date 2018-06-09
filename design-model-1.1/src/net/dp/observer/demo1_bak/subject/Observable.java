package net.dp.observer.demo1_bak.subject;

import java.util.ArrayList;

import net.dp.observer.demo1.Observer;

public class Observable implements Subject{
	protected ArrayList<Observer> observers;

	@Override
	public void notifyObservers() {
		
	}
	
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
