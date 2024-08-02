package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Acordo;
import br.com.censfam.sge.model.forekey.AcordoKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcordoRepository extends JpaRepository<Acordo, AcordoKey> {
}
