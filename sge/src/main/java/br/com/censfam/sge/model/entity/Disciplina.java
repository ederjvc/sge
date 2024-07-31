package br.com.censfam.sge.model.entity;

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
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_dis;

    @Column(nullable = false, length = 50)
    private String des_dis;

    @Column(nullable = false, length = 15)
    private String abr_dis;

    @Column(nullable = false, length = 1)
    private String sit_dis;
}
