package io.yadnyesh.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.yadnyesh.microservices.currencyconversionservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		return (new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 0));
		
	}

}
