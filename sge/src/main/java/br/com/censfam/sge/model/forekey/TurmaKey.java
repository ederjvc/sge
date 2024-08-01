package br.com.censfam.sge.model.forekey;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TurmaKey implements Serializable {

    private Integer id_tur ;
    private Integer ano_tur;
}
