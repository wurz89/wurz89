package it.web.zanzaraOrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("it.web.zanzaraOrm.")
//@EnableJpaRepositories("it.web.zanzaraOrm.repository")
//@EntityScan("it.web.zanzaraOrm.entity")
public class ZanzaraOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZanzaraOrmApplication.class, args);
	}

}
