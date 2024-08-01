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
public class LocaisKey implements Serializable {

    private Integer ano_loc ;
    private Integer alu_id;
}
