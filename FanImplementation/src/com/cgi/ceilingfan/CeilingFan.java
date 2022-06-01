package com.cgi.ceilingfan;
/**
 * ceiling fan implementation
 * @author Mamatha
 *
 */
public class CeilingFan {
	
	
	private final static int SPEED3_OFF = 0;
	private final static int HIGHEST_SPEED_LEVEL = 2;
	
	private int currentSpeed;
	private boolean reverseDirection;
	
	public CeilingFan() {
		reverseDirection = false;
		currentSpeed = SPEED3_OFF;
		
	}
        //If speed reaches to the maximum level, fan will be turned off until then it increases it's speed.
	public void riseSpeed() {
		if(currentSpeed == HIGHEST_SPEED_LEVEL) {
			currentSpeed = SPEED3_OFF;
		}
		else {
			currentSpeed++;
		}
	}
	
	//Reversing the fan direction
	public void alterDirection() {
		reverseDirection = true;
	}

        //getter to read the current speed level
	public int getCurrentSpeed() {
		return currentSpeed;
	}
    
	//getter to get the direction of fan 
	public boolean isReverseDirection() {
		return reverseDirection;
	}
	
	
	public static void main(String[] args) {
		
		CeilingFan fan = new CeilingFan();
		
		System.out.println("Initial fan speed " + fan.getCurrentSpeed()); 
		System.out.println("Initial fan direction " + (fan.isReverseDirection() ? "Reverse" : "Normal"));
		
		fan.riseSpeed(); 
		System.out.println("Increased to speed level " + fan.getCurrentSpeed());  
		
		fan.riseSpeed();
		System.out.println("Increased to speed level " + fan.getCurrentSpeed());
		
		fan.alterDirection();
		System.out.println("changed the direcion? " + (fan.isReverseDirection() ? "Yes" : "No"));
		
		fan.riseSpeed();
		System.out.println("Now speed level is " + fan.getCurrentSpeed());
	}

}
