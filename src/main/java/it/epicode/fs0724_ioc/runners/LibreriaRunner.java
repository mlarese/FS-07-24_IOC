package it.epicode.fs0724_ioc.runners;

import it.epicode.fs0724_ioc.entity.Libreria;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class LibreriaRunner implements ApplicationRunner {
    private final Libreria libreria;

    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        System.out.println("---- Application started ----");
        System.out.println("Libreria: " + libreria);

    }
}
