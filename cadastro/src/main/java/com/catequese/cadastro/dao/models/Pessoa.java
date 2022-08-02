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
@Table(name="tb_pessoa")
public class Pessoa implements Serializable {
    @Id
    @Column(name="pessoa_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long pessoaId;

    private String nome;

    private String telefone;

    private String email;

    @ManyToOne
    @JoinColumn(name = "relacionmento_id", referencedColumnName = "relacionmento_id")
    private Relacionamento relacionamento;

}
