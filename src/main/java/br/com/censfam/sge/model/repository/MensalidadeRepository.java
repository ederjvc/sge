package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Mensalidade;
import br.com.censfam.sge.model.forekey.MensalidadeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensalidadeRepository extends JpaRepository<Mensalidade, MensalidadeKey> {
}
