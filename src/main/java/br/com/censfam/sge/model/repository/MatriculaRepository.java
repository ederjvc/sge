package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Matricula;
import br.com.censfam.sge.model.forekey.MatriculaKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaKey> {
}
