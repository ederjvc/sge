package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Notas;
import br.com.censfam.sge.model.forekey.NotasKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotasRepository extends JpaRepository<Notas, NotasKey> {
}
