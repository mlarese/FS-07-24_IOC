package it.epicode.fs0724_ioc.services;

import it.epicode.fs0724_ioc.entity.Autore;
import it.epicode.fs0724_ioc.entity.Libro;
import it.epicode.fs0724_ioc.repo.AutoreRepo;
import it.epicode.fs0724_ioc.repo.LibroRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibriEAutoriService {
    private final LibroRepo libroRepo;
    private final AutoreRepo autoreRepo;

    @Transactional
    public void saveBookAndAuthor(Libro l, Autore  a) {
        libroRepo.save(l);
        autoreRepo.save(a);

        l.setAutore(a);
        a.getLibri().add(l);



    }

    public List<Libro> getLibri() {
        return libroRepo.findAll();
    }

}
