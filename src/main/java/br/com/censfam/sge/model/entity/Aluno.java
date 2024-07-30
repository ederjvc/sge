package br.com.censfam.sge.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alun;

    @Column(length = 100)
    private String nom_alu;

    @Column(length = 100)
    private String end_alu;

    @Column(length = 50)
    private String bai_alu;

    @Column(length = 50)
    private String cid_alu;

    @Column(length = 5)
    private String ufr_alu;

    @Column(length = 10)
    private String cep_alu;

    @Column(length = 15)
    private String tel_alu;

    @Column
    private BigDecimal vlm_alu;

    @Column
    private BigDecimal dsm_alu;

    @Column(length = 1)
    private String bol_alu;

    @Column(length = 50)
    private String nat_alu;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dtn_alu;

    @Column(length = 15)
    private String cpf_alu;

    @Column(length = 15)
    private String rg_alu;

    @Column(length = 100)
    private String ema_alu;

    @Column(length = 250)
    private String obs_alu1;

    @Column(length = 250)
    private String obs_alu2;

    @Column(length = 250)
    private String obs_alu3;

    @Column(length = 250)
    private String obs_alu4;

    @Column(length = 10)
    private String pro_alu;

    @Column(length = 10)
    private String esc_alu;

    @Column(length = 30)
    private String rel_alu;

    @Column(length = 1)
    private String port_alu;

    @Column(length = 50)
    private String doen_alu;

    @Column(length = 1)
    private String ale_alu;

    @Column(length = 30)
    private String med_alu;

    @Column(length = 5)
    private String sang_alu;

    @Column(length = 30)
    private String pto_alu;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dtc_alu;

    @Column(length = 11)
    private String cdb_alu;

    @Column(length = 150)
    private String fot_alu;

    @Column(length = 50)
    private String usu_fun;

    @ManyToOne
    @JoinColumn(name = "res_id")
    private Responsavel responsavel;

    @ManyToOne
    @JoinColumn(name = "gen_id")
    private Genitor genitor;
}
