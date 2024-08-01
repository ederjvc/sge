package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.*;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Matricula implements Serializable {

    @EmbeddedId
    private MatriculaKey id;

    @Column
    private Integer nch_mat;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dat_mat;

    @Column(nullable = false, length = 1)
    private String tip_mat;
}
