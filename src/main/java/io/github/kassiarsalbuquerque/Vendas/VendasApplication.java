package io.github.kassiarsalbuquerque.Vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.kassiarsalbuquerque.Vendas.annotation.GatoAnnotation;

@RestController
@SpringBootApplication
public class VendasApplication {
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@Autowired
	@Qualifier("otherApplicationName")
	private String otherApplicationName;
	
	@Value("${spring.application.name}")
	private String applicationNameProperties;
	
	@GatoAnnotation
	private Animal animal;
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String helloWorld() {
		//return "Hello World VendasApplication!";
		//return applicationName;
		//return otherApplicationName;
		//return applicationNameProperties;
		
		return this.animal.fazerBarulho();
	}

	public static void main(String[] args) {
		//SpringApplication.run(VendasApplication.class, args);
		
		SpringApplication application = new SpringApplication(VendasApplication.class);
		//application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}