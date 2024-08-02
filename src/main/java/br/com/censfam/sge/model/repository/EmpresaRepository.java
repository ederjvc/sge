package br.com.censfam.sge.model.repository;

import br.com.censfam.sge.model.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
}
