package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Turma;
import br.com.censfam.sge.model.forekey.TurmaKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, TurmaKey> {
}
