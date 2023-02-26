package com.learn.exchangeservice.controller;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ExchangeController {
    //USD TO INR
//    @Autowired
//    private Environment environment;
    @GetMapping("/exchangevalue/{fromCurrency}/{toCurrency}")
    public ExchangeValue getExchangeValue(@PathVariable String fromCurrency,
                                   @PathVariable String toCurrency){
        BigDecimal conversionValue = null;

        ExchangeValue exchangeValue = new ExchangeValue();

        if(fromCurrency != null && toCurrency != null){
            if(fromCurrency.equalsIgnoreCase("usd") &&
                    toCurrency.equalsIgnoreCase("inr")){
                conversionValue = BigDecimal.valueOf(82.72);
            }
            if(fromCurrency.equalsIgnoreCase("inr") &&
                    toCurrency.equalsIgnoreCase("usd")){
                conversionValue = BigDecimal.valueOf(0.012);
            }
            if(fromCurrency.equalsIgnoreCase("euro") &&
                    toCurrency.equalsIgnoreCase("inr")){
                conversionValue = BigDecimal.valueOf(88.82);
            }
            if(fromCurrency.equalsIgnoreCase("inr") &&
                    toCurrency.equalsIgnoreCase("euro")){
                conversionValue = BigDecimal.valueOf(0.011);
            }
        }
        exchangeValue = new ExchangeValue(1000L,fromCurrency,toCurrency,conversionValue);
//        exchangeValue.setPort(Integer.parseInt(environment.getProperties().getProperty("server.port")));
        return exchangeValue;
    }
    //INR TO USD

    //EURO TO INR
    //INR TO EURO

}
