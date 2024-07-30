package br.com.censfam.sge.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Responsavel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_res;

    @Column(length = 100)
    private String nom_res;

    @Column(length = 100)
    private String end_res;

    @Column(length = 50)
    private String bai_res;

    @Column(length = 50)
    private String cid_res;

    @Column(length = 5)
    private String uf_res;

    @Column(length = 10)
    private String cep_res;

    @Column(length = 15)
    private String tl1_res;

    @Column(length = 15)
    private String tl2_res;

    @Column(length = 15)
    private String cpf_res;

    @Column(length = 15)
    private String reg_res;

    @Column(length = 100)
    private String mai_res;

    @Column
    private BigDecimal deb_res;

    @Column(length = 10)
    private Integer qte_res;

    @Column(length = 100)
    private String usu_fun;
}
