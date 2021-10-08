package br.com.willians.conversorcelsiusfarenheit.entity;

import br.com.willians.conversorcelsiusfarenheit.enums.ConversorType;
import lombok.*;

import javax.persistence.*;

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
