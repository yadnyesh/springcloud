package io.yadnyesh.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.yadnyesh.microservices.currencyexchangeservice.model.ExchangeValue;
import io.yadnyesh.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRespository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = exchangeValueRespository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
