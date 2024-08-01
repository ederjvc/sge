package br.com.censfam.sge.model.entity;

import br.com.censfam.sge.model.forekey.*;

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
public class Locais implements Serializable {

    @EmbeddedId
    private LocaisKey id;

    @Column(nullable = false,length = 10)
    private String ser_loc;

    @Column(nullable = false,length = 50)
    private String est_loc;

    @Column(nullable = false,length = 30)
    private String cid_loc;

    @Column(nullable = false,length = 20)
    private String res_loc;

    @Column
    private Integer dia_loc;

    @Column
    private Integer fts_loc;

    @Column
    private Integer chs_loc;
}
