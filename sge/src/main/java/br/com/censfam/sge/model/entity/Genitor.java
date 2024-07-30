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
public class Genitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_gen;

    @Column(length = 100)
    private String nompai;

    @Column(length = 15)
    private String regpai;

    @Column(length = 15)
    private String cpfpai;

    @Column(length = 100)
    private String endpai;

    @Column(length = 50)
    private String baipai;

    @Column(length = 50)
    private String cidpai;

    @Column(length = 5)
    private String ufpai;

    @Column(length = 10)
    private String ceppai;

    @Column(length = 15)
    private String telpai;

    @Column(length = 15)
    private String celpai;

    @Column(length = 100)
    private String emapai;

    @Column(length = 100)
    private String nommae;

    @Column(length = 15)
    private String regmae;

    @Column(length = 15)
    private String cpfmae;

    @Column(length = 100)
    private String endmae;

    @Column(length = 50)
    private String baimae;

    @Column(length = 50)
    private String cidmae;

    @Column(length = 5)
    private String ufmae;

    @Column(length = 10)
    private String cepmae;

    @Column(length = 15)
    private String telmae;

    @Column(length = 15)
    private String celmae;

    @Column(length = 100)
    private String emamae;

}
