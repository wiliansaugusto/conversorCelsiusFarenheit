package br.com.willians.conversorcelsiusfarenheit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConversorType {

    CELSIUS("Celsius"),
    FARENHEIT("Farenheit");

    private final String description;

}
