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
public class Historico implements Serializable {

    @EmbeddedId
    private HistoricoKey id;

    @Column(nullable = false, length = 10)
    private String ser1_his;

    @Column(nullable = false, length = 10)
    private String ser2_his;

    @Column(nullable = false, length = 10)
    private String ser3_his;

    @Column(nullable = false, length = 10)
    private String ser4_his;

    @Column(nullable = false, length = 10)
    private String ser5_his;

}
