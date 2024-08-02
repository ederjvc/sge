package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Gradalunos;
import br.com.censfam.sge.model.forekey.GradalunosKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradalunosRepository extends JpaRepository<Gradalunos, GradalunosKey> {
}
