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
@Table(name="tb_transferencia")
public class Transferencia implements Serializable {
    @Id
    @Column(name="transferencia_id", length = 10)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long transferenciaId;

    @Column(name="paroquia_enviado")
    private String paroquiaEnviado;

    @Column(name="paroquia_recebida")
    private String paroquiaRecebida;

    @Column(name="data_envio")
    private String dataEnvio;

    @Column(name="data_recebimento")
    private String dataRecebimento;

    @Column(name="responsavel_transferencia")
    private String responsavelTranferencia;
}
