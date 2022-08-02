package com.catequese.cadastro.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_aluno")
public class Aluno implements Serializable {
    @Id
    @Column(name="aluno_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long alunoId;

    private String nome;

    @Column(name="data_nascimento")
    private LocalDateTime dataNascimento;

    @Column(name="data_batismo")
    private LocalDateTime dataBatismo;

    private String telefone;

}
