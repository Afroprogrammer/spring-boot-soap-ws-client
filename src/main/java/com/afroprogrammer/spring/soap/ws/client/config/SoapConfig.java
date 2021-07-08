package com.afroprogrammer.spring.soap.ws.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    //create a marshaller to scan the package and convert the object to classes
    //and return the object
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.afroprogrammer.spring.soap.ws.client.loaneligibility");
        return marshaller;
    }
}
