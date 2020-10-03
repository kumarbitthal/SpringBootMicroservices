package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("exchange-service")
public class ExchangeRatesConfiguration {
	
	private int rupeeFactor;
	private int dollorFactor;
	
	protected ExchangeRatesConfiguration(){
		
	}
	
	public ExchangeRatesConfiguration(int rupeeFactor, int dollorFactor){
		this.rupeeFactor = rupeeFactor;
		this.dollorFactor = dollorFactor;
	}
	
	public int getRupeeFactor() {
		return rupeeFactor;
	}
	public void setRupeeFactor(int rupeeFactor) {
		this.rupeeFactor = rupeeFactor;
	}
	public int getDollorFactor() {
		return dollorFactor;
	}
	public void setDollorFactor(int dollorFactor) {
		this.dollorFactor = dollorFactor;
	}

}
