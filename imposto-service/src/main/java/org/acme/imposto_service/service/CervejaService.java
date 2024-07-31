package org.acme.imposto_service.service;

import org.acme.imposto_service.model.Cerveja;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Service
public class CervejaService {
    public Cerveja getById(Long id){
        /*
        Interface antiga (Spring < 6.0)
         */
        //RestTemplate restTemplate = new RestTemplate();
        RestClient restClient = RestClient.create();
        var serverUrl = String.format("http://localhost:8081/%d", id);
        Cerveja cerveja = restClient.get()
                .uri(serverUrl)
                .retrieve()
                .toEntity(Cerveja.class).getBody();
        return cerveja;
    }

}
