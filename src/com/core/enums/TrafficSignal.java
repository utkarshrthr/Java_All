package com.core.enums;

public enum TrafficSignal {
	
	RED("wait", 0), 	// each of this values represents an Instance of TrafficSignal enum
	GREEN("go", 1), 	// for every type of these values there must be an parameterized constructor
	ORANGE("slow down", 2), 
	YELLOW, BLUE(3);
	 
    private String action;
    private int signalCode;
    
    public String getAction(){
        return this.action;
    }
    
    public int getSignalCode(){
        return this.signalCode;
    }
 
    TrafficSignal(String action){
        this.action = action;
    }

	TrafficSignal(String action, int signalCode) {
		this.action = action;
		this.signalCode = signalCode;
	}

	TrafficSignal() {
		
	}

	TrafficSignal(int signalCode) {
		this.signalCode = signalCode;
	}
	
	@Override
	public String toString() {
		return this.action+" - "+this.signalCode;
	}
}
