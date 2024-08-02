package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Locais;
import br.com.censfam.sge.model.forekey.LocaisKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocaisRepository extends JpaRepository<Locais, LocaisKey> {
}
