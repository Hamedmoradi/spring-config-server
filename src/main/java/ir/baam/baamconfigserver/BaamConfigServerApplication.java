package ir.baam.baamconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BaamConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaamConfigServerApplication.class, args);
	}

}
