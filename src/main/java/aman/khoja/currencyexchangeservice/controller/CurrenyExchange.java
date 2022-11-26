package aman.khoja.currencyexchangeservice.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrenyExchange {

    @Id
    private Long id;
    @Column(name = "curreny_from")
    private String from;
    @Column(name = "curreny_to")
    private String to;
    private BigDecimal conversionRate;
    private String environment;

    public CurrenyExchange() {
    }

    public CurrenyExchange(Long id, String from, String to, BigDecimal conversionRate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionRate = conversionRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "CurrenyExchange{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionRate=" + conversionRate +
                ", environment='" + environment + '\'' +
                '}';
    }
}
