package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
