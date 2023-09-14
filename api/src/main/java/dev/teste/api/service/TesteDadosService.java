package dev.teste.api.service;

import dev.teste.api.entity.TesteDadoEntity;

import java.util.List;
import java.util.Optional;

public interface TesteDadosService {
    List<TesteDadoEntity> findallDados();

    Optional<TesteDadoEntity> findById(Long id);

    TesteDadoEntity saveDado(TesteDadoEntity testedadoEntity);
    TesteDadoEntity updateDado(TesteDadoEntity testedadoEntity);

    void deleteDado(Long id);

}
