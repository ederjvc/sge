package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReciboRepository extends JpaRepository<Recibo, Integer> {
}
