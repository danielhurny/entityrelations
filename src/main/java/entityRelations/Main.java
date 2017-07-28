package entityRelations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entityRelations.oneToOne.ConsoleUi;

@Configuration
@SpringBootApplication

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}
	
	 @Bean
	 public CommandLineRunner runner(ConsoleUi ui){
	  return args ->ui.play();
	  }
	  
	 


}
