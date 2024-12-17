package it.epicode.fs0724_ioc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "libri")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titolo;

    @ManyToOne
    private Autore autore;
}
