package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.*;

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
public class Historico2 implements Serializable {

    @EmbeddedId
    private Historico2Key id;

    @Column(nullable = false, length = 10)
    private String ser1_his;

    @Column(nullable = false, length = 10)
    private String ser2_his;

    @Column(nullable = false, length = 10)
    private String ser3_his;

    @Column(nullable = false, length = 10)
    private String ser4_his;

    @Column(nullable = false, length = 10)
    private String ser5_his;

    @Column
    private Integer ald5_his;

    @Column
    private Integer fts5_his;

    @Column(nullable = false,length = 10)
    private String ser6_his;

    @Column
    private Integer ald6_his;

    @Column
    private Integer fts6_his;

    @Column(nullable = false,length = 10)
    private String ser7_his;

    @Column
    private Integer ald7_his;

    @Column
    private Integer fts7_his;

    @Column(nullable = false,length = 10)
    private String ser8_his;

    @Column
    private Integer ald8_his;

    @Column
    private Integer fts8_his;

    @Column(nullable = false,length = 10)
    private String ser9_his;

    @Column
    private Integer ald9_his;

    @Column
    private Integer fts9_his;

    @Column(nullable = false,length = 10)
    private String rstd_his;

    @Column
    private Integer dles_his;

    @Column
    private Integer qfts_his;

    @Column
    private Integer chos_his;

    @Column(nullable = false,length = 50)
    private String usu_fun;
}
