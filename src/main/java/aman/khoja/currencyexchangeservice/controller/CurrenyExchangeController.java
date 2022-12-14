package aman.khoja.currencyexchangeservice.controller;

import aman.khoja.currencyexchangeservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrenyExchangeController {

    @Autowired
    private CurrencyExchangeRepository repository;
    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrenyExchange convertValue(@PathVariable String from, @PathVariable String to) {
//        CurrenyExchange currenyExchange = new CurrenyExchange(1000L, from, to, BigDecimal.valueOf(50));
        CurrenyExchange currenyExchange = repository.findByFromAndTo(from, to);

        if(currenyExchange == null)
        {
            throw new RuntimeException("Unable to find data for " + from + " to " + to);
        }
        String port = environment.getProperty("local.server.port");
        currenyExchange.setEnvironment(port);
        return currenyExchange;
    }
}
