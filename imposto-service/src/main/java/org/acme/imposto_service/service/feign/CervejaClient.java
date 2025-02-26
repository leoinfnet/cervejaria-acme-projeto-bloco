package org.acme.imposto_service.service.feign;

import org.acme.imposto_service.model.Cerveja;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CERVEJA-SERVICE")
public interface CervejaClient {
    @GetMapping("/{id}")
    Cerveja findById(@PathVariable Long id);

}
