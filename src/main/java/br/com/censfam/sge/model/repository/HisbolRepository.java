package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Hisbol;
import br.com.censfam.sge.model.forekey.HisbolKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HisbolRepository extends JpaRepository<Hisbol, HisbolKey> {
}
