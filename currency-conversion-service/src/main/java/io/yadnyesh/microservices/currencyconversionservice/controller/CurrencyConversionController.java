package io.yadnyesh.microservices.currencyconversionservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.yadnyesh.microservices.currencyconversionservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable String quantity) {
		
		
	}

}
