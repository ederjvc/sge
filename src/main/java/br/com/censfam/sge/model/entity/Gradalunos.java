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
public class Gradalunos implements Serializable {

    @EmbeddedId
    private GradalunosKey id;

    @Column
    private Integer prev_alu;

    @Column
    private Integer dad_alu;
}
