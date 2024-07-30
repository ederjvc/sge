package br.com.censfam.sge.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id_emp;

    @Column(length = 80)
    private  String nom_emp;

    @Column(length = 80)
    private  String end_emp;

    @Column(length = 20)
    private  String bai_emp;

    @Column(length = 20)
    private  String cid_emp;

    @Column(length = 5)
    private  String est_emp;

    @Column(length = 10)
    private  String cep_emp;

    @Column(length = 20)
    private  String cnpj_emp;

    @Column(length = 12)
    private  String tel1_emp;

    @Column(length = 12)
    private  String tel2_emp;

    @Column(length = 100)
    private  String emai_emp;

}
