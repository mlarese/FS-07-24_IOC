package it.epicode.fs0724_ioc.configuration;

import com.github.javafaker.Faker;
import it.epicode.fs0724_ioc.entity.Libro;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@RequiredArgsConstructor
public class LibroConfig {
    private final Faker faker;

    @Bean
    @Scope("prototype")
    public Libro newLibro() {
        Libro libro = new Libro();
        libro.setTitolo(faker.book().title());
        return libro;
    }
}
