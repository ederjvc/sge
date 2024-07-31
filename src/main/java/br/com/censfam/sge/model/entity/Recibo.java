package br.com.censfam.sge.model.entity;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recibo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num_rec;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dat_rec;

    @Column
    private BigDecimal val_rec;

    @Column(nullable = false, length = 150)
    private String his_rec;

    @Column(nullable = false, length = 10)
    private String tip_rec;

    @Column(nullable = false, length = 50)
    private String usu_fun;
}
