package io.github.parhamnooran.ParhamNooran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ParhamNooranApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParhamNooranApplication.class, args);
	}

	@GetMapping("/")
	public String getMapping(){
		return "index";
	}
	@GetMapping("/greeting")
	public String getGreeting(){
		return "greeting";
	}
}
