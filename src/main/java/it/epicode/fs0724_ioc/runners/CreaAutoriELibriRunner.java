package it.epicode.fs0724_ioc.runners;

import it.epicode.fs0724_ioc.entity.Autore;
import it.epicode.fs0724_ioc.entity.Libro;
import it.epicode.fs0724_ioc.services.LibriEAutoriService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreaAutoriELibriRunner implements ApplicationRunner {
    private final ObjectProvider<Autore> autoreProvider;
    private final ObjectProvider<Libro> libroProvider;
    private final LibriEAutoriService service;

    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {

        for (int i = 0; i < 20; i++) {
            Autore a = autoreProvider.getObject();
            Libro l = libroProvider.getObject();

            service.saveBookAndAuthor(l,a);


        }

        List<Libro> libri = service.getLibri();
        System.out.println("Libri: " + libri);

    }

}
