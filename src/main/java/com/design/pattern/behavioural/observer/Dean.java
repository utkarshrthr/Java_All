package com.design.pattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Dean {
	
	private List<Observer> observers = new ArrayList<Observer>();
	  
	private boolean isActive;

	public void setActive(boolean state) {
		this.isActive = state;
		notifyAllObservers(state);
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public boolean isActive() {
		return this.isActive;
	}

	public void attach(Observer observer){
		observers.add(observer);		
	}

	public void notifyAllObservers(boolean state){
		for (Observer observer : observers) {
			observer.update(state);
		}
	} 
}
