package it.epicode.fs0724_ioc;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@SpringBootApplication
public class Fs0724IocApplication {

    public static void main(String[] args) {
        SpringApplication.run(Fs0724IocApplication.class, args);
    }

    @Bean
    public Faker getFaker() {
        return new Faker(Locale.ITALIAN);
    }

}
