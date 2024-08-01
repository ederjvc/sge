package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.TurmaKey;
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
public class Turma implements Serializable {

    @EmbeddedId
    private TurmaKey id;

    @Column(nullable = false, length = 50)
    private String des_tur;

    @Column(nullable = false, length = 50)
    private String ens_tur;

    @Column(nullable = false, length = 50)
    private String ser_tur;

    @Column(nullable = false, length = 50)
    private String tur_tur;
}
