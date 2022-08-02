package com.catequese.cadastro.dao.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_etapa")
public class Etapa implements Serializable {
    @Id
    @Column(name="etapa_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long etapaId;

    private String nome;

    private String idade;
}
