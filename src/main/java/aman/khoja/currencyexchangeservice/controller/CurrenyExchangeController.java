package aman.khoja.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrenyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrenyExchange convertValue(@PathVariable String from, @PathVariable String to) {
        return new CurrenyExchange(1000L,from,to, BigDecimal.valueOf(50));
    }
}
