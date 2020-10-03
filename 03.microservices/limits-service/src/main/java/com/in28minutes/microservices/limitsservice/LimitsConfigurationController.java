package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitConfiguration configuration;

	@Autowired
	private ExchangeRatesConfiguration exchangeConfiguration;

	@GetMapping("/")
	public String showWelcomePage() {
		return "This is home page";
	}

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
		return limitConfiguration;
	}

	@GetMapping("/exchanges")
	public ExchangeRatesConfiguration retrieveExchangeValues() {
		ExchangeRatesConfiguration exRates = new ExchangeRatesConfiguration(exchangeConfiguration.getDollorFactor(),
				exchangeConfiguration.getRupeeFactor());
		return exRates;
	}

	// @GetMapping("/fault-tolerance-example")
	// @HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	// public LimitConfiguration retrieveConfiguration() {
	// throw new RuntimeException("Not available");
	// }

	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(999, 9);
	}

}
