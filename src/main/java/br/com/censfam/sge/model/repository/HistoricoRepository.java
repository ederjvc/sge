package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Historico;
import br.com.censfam.sge.model.forekey.HistoricoKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<Historico, HistoricoKey> {
}
