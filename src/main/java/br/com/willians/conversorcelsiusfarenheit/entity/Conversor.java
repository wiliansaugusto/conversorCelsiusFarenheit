package br.com.willians.conversorcelsiusfarenheit.entity;

import br.com.willians.conversorcelsiusfarenheit.enums.ConversorType;
import lombok.*;

import javax.persistence.*;

/*
Entidade que servirá de mapeamento para o banco de dados

 */
@Entity
@Table(name = "tb_conversor")
@Getter
@Setter
public class Conversor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double valorInformado;

    @Column(nullable = false)
    private double valorConvertido;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ConversorType type;


}
