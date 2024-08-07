package org.acme.imposto_service.service.feign;

import org.acme.imposto_service.model.Fabricante;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("FABRICANTE-SERVICE")
public interface FabricanteClient {
    @GetMapping("/{id}")
    Fabricante getById(@PathVariable Long id);

}
