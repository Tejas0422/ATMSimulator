package com.app.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtmSimulatorApplication {

	public AtmSimulatorApplication() {
		System.out.println("inside AtmSimulatorApplication constructor");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AtmSimulatorApplication.class, args);
	}
	
	/*
	 * @Bean // equivalent to <bean id ..../> in xml file public ModelMapper
	 * mapper() { ModelMapper modelMapper = new ModelMapper();
	 * modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
	 * ; return modelMapper; }
	 */

}
