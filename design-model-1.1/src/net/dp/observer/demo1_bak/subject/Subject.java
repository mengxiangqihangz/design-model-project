package net.dp.observer.demo1_bak.subject;

import net.dp.observer.demo1.Observer;




public interface Subject {
	void registerObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
}
