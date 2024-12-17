package it.epicode.fs0724_ioc.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String cognome;

    @OneToMany(mappedBy = "autore")
    @ToString.Exclude
    private List<Libro> libri = new ArrayList<>();
}
