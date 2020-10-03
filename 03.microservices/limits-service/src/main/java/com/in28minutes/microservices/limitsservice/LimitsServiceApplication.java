package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@ComponentScan({"com.in28minutes.microservices.limitsservice.bean"})
public class LimitsServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
}
