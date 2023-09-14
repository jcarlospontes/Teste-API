package dev.teste.api.service.impl;

import dev.teste.api.entity.TesteDadoEntity;
import dev.teste.api.repository.TesteDadoRepository;
import dev.teste.api.service.TesteDadosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TesteDadosServiceImpl implements TesteDadosService {

    private final TesteDadoRepository dadoRepository;

    public TesteDadosServiceImpl(TesteDadoRepository dadoRepository) {
        this.dadoRepository = dadoRepository;
    }

    @Override
    public List<TesteDadoEntity> findallDados() {
        return dadoRepository.findAll();
    }

    @Override
    public Optional<dev.teste.api.entity.TesteDadoEntity> findById(Long id) {
        return dadoRepository.findById(id);
    }

    @Override
    public TesteDadoEntity saveDado(TesteDadoEntity testedadoEntity) {
        return dadoRepository.save(testedadoEntity);
    }

    @Override
    public TesteDadoEntity updateDado(TesteDadoEntity testedadoEntity) {
        return dadoRepository.save(testedadoEntity);
    }

    @Override
    public void deleteDado(Long id) {
        dadoRepository.deleteById(id);
    }
}
