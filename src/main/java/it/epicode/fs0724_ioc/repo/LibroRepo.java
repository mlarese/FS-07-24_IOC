package it.epicode.fs0724_ioc.repo;

import it.epicode.fs0724_ioc.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepo  extends JpaRepository<Libro, Long> {
}
