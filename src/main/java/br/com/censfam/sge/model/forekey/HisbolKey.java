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
public class HisbolKey implements Serializable {

    private Integer locais_alu ;
    private Integer locais_ano;
}