package it.epicode.fs0724_ioc.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Libreria {
    @Value( "${application.nome_libreria}" )
    private String nomeLibreria;

    @Value( "${application.nome_fondatore}" )
    private String fondatore ;

    private Integer annoFondazione;
}
