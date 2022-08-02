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
@Table(name="tb_historico")
public class Historico implements Serializable {
    @Id
    @Column(name="historico_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long historicoId;

    private String ano;

    @ManyToOne
    @JoinColumn(name = "etapa_id", referencedColumnName = "etapa_id")
    private Etapa etapa;

    @ManyToOne
    @JoinColumn(name = "catequista_id", referencedColumnName = "catequista_id")
    private Catequista catequista;

    @ManyToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "aluno_id")
    private Aluno aluno;
}
