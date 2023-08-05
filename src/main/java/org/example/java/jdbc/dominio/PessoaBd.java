package org.example.java.jdbc.dominio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class PessoaBd {

    private final String name;
    private final String cpf;
    private final Integer id;


}
