package aman.khoja.currencyexchangeservice.repository;

import aman.khoja.currencyexchangeservice.controller.CurrenyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrenyExchange , Long> {
    CurrenyExchange findByFromAndTo(String from, String to);
}
