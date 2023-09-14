package dev.teste.api.repository;

import dev.teste.api.entity.TesteDadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteDadoRepository extends JpaRepository<TesteDadoEntity, Long> {

}
