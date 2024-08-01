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
public class NotasKey implements Serializable {

    private Integer tur_ano;
    private Integer tur_id;
    private Integer alu_id;
    private Integer dis_id;
}
