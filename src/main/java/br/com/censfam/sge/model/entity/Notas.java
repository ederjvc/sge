package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notas implements Serializable {

    @EmbeddedId
    private NotasKey id;

    @Column(nullable = false, length = 10)
    private String nt1_not;

    @Column
    private Integer ch1_not;

    @Column
    private Integer ft1_not;

    @Column(nullable = false, length = 10)
    private String nt2_not;

    @Column
    private Integer ch2_not;

    @Column
    private Integer ft2_not;

    @Column(nullable = false, length = 10)
    private String nt3_not;

    @Column
    private Integer ch3_not;

    @Column
    private Integer ft3_not;

    @Column(nullable = false, length = 10)
    private String nt4_not;

    @Column
    private Integer ch4_not;

    @Column
    private Integer ft4_not;

    @Column
    private BigDecimal mdp_not;

    @Column
    private BigDecimal pvf_not;

    @Column
    private BigDecimal mdf_not;

    @Column
    private Integer hra_not;

    @Column
    private Integer fts_not;

    @Column(nullable = false, length = 10)
    private String res_not;
}
