package com.afroprogrammer.spring.soap.ws.client;

import com.afroprogrammer.spring.soap.ws.client.client.SoapClient;
import com.afroprogrammer.spring.soap.ws.client.loaneligibility.Acknowledgement;
import com.afroprogrammer.spring.soap.ws.client.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSoapWsClientApplication {
    @Autowired
    private SoapClient client;

    @PostMapping("/getLoanStatus")
    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
        return client.getLoanStatus(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSoapWsClientApplication.class, args);
    }

}
