package com.catequese.cadastro.dao.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_catequista")
public class Catequista implements Serializable {
    @Id
    @Column(name="catequista_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long catequistaId;

    private String nome;

    private String telefone;

    private String email;
}
