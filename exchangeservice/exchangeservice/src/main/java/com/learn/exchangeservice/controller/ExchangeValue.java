package com.learn.exchangeservice.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Exchange_value")
public class ExchangeValue {
    @Id
    private long id;
    @Column(name = "currency_from")
    private String fromCurrency;
    @Column(name = "currency_to")
    private String toCurrency;
    @Column(name = "conversion_value")
    private BigDecimal conversionValue;
    @Column(name = "port")
    private int port;

    public ExchangeValue(long id,String fromCurrency,String toCurrency, BigDecimal conversionValue){
        super();
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.conversionValue = conversionValue;
    }

}
