package it.epicode.fs0724_ioc.repo;

import it.epicode.fs0724_ioc.entity.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoreRepo  extends JpaRepository<Autore, Long> {
}
