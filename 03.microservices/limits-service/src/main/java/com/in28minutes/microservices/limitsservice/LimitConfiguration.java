package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitConfiguration {
	
	private int minimum;
	private int maximum;
	
	protected LimitConfiguration(){
		
	}

	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
