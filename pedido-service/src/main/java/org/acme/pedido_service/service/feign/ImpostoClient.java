package org.acme.pedido_service.service.feign;

import org.acme.pedido_service.model.Pedido;
import org.acme.pedido_service.service.ImpostoResponsePayload;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("IMPOSTO-SERVICE")
public interface ImpostoClient {
    @PostMapping("/")
    ImpostoResponsePayload calcularImposto(Pedido pedido);
}
