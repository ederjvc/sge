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
public class HistoricoKey implements Serializable {

    private Integer mtur_ano ;
    private Integer mtur_id;
    private Integer malu_id ;
    private Integer dsid_dis;
}
