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
public class Mensalidade implements Serializable{

    @EmbeddedId
    private MensalidadeKey id;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dte_men;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dtv_alu;

    @Column
    private BigDecimal vlm_men;

    @Column
    private BigDecimal des_men;

    @Column
    private BigDecimal mul_men;

    @Column(nullable = false, length = 50)
    private String usu_fun;

    @Column
    private Integer rec_num;
}
