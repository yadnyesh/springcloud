package io.yadnyesh.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	
	public LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int max, int min) {
		this.maximum = max;
		this.minimum = min;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
	
	

}
