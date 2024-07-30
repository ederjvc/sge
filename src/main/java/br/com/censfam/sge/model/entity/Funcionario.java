package br.com.censfam.sge.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_fun;

    @Column(length = 80)
    private String nom_fun;

    @Column(length = 80)
    private String end_fun;

    @Column(length = 20)
    private String bai_fun;

    @Column(length = 15)
    private String cep_fun;

    @Column(length = 20)
    private String civil_fun;

    @Column(length = 15)
    private String fone_fun;

    @Column(length = 15)
    private String cel_fun;

    @Column(length = 20)
    private String carg_fun;

    @Column(length = 10)
    private String rg_fun;

    @Column(length = 15)
    private String cpf_fun;

    @Column(nullable = false)
    private LocalDate datini_fun;

    @Column(nullable = true)
    private LocalDate datfin_fun;

    @Column(length = 25)
    private String login_fun;

    @Column(length = 40)
    private String snh_fun;

    @Column(length = 100)
    private String email_fun;

    @Column(length = 11)
    private Integer niv_fun;

    @Column(length = 30)
    private String grau_fun;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Empresa empresa;
}
