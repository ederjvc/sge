package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Acordo implements Serializable {

    @EmbeddedId
    private AcordoKey id;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dte_aco;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dtv_aco;

    @Column
    private BigDecimal vlm_aco;

    @Column
    private BigDecimal des_aco;

    @Column
    private BigDecimal mul_aco;

    @Column(nullable = false, length = 50)
    private String usu_fun;

    @Column
    private Integer rec_num;
}
