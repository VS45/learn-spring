package com.vs45tech.springboot.learnspring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;
    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration getCurrencyConfig(){
        return configuration;
    }
    @GetMapping("/currency-url")
    public String getCurrencyUrl(){
        return configuration.getUrl();
    }
}
