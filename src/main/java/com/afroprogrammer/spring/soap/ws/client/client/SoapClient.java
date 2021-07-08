package com.afroprogrammer.spring.soap.ws.client.client;

import com.afroprogrammer.spring.soap.ws.client.loaneligibility.Acknowledgement;
import com.afroprogrammer.spring.soap.ws.client.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.jar.JarEntry;
@Service
public class SoapClient {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public Acknowledgement getLoanStatus(CustomerRequest request){
        template = new WebServiceTemplate(marshaller);
        Acknowledgement acknowledgement = (Acknowledgement) template.marshalSendAndReceive
                ("http://localhost:8080/ws",request);
        return acknowledgement;
    }
}
