package it.epicode.fs0724_ioc.configuration;

import com.github.javafaker.Faker;
import it.epicode.fs0724_ioc.entity.Autore;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@RequiredArgsConstructor
public class AutoreConfig {
    private final Faker faker;

    @Bean
    @Scope("prototype")
    public Autore newAutore() {
        Autore autore = new Autore();
        autore.setNome(faker.book().author());
        return autore;
    }

}
