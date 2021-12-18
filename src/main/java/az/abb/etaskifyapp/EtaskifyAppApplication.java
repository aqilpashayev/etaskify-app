package az.abb.etaskifyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EtaskifyAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtaskifyAppApplication.class, args);
    }

}
