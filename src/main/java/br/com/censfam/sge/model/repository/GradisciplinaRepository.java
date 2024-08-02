package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Gradisciplina;
import br.com.censfam.sge.model.forekey.GradisciplinaKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradisciplinaRepository extends JpaRepository<Gradisciplina, GradisciplinaKey> {
}
