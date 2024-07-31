package org.acme.cerveja_service.service;

import lombok.RequiredArgsConstructor;
import org.acme.cerveja_service.model.Cerveja;
import org.acme.cerveja_service.repository.CervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CervejaService {
    private final CervejaRepository cervejaRepository;
    public Cerveja create(Cerveja cerveja) {
        return cervejaRepository.save(cerveja);
    }
    public List<Cerveja> findAll() {
        return cervejaRepository.findAll();
    }
    public Optional<Cerveja> findById(Long id) {
        return cervejaRepository.findById(id);
    }
    public void deleteById(Long id) {
        cervejaRepository.deleteById(id);
    }
    public Cerveja update(Cerveja cerveja) {
        return cervejaRepository.save(cerveja);
    }
}
