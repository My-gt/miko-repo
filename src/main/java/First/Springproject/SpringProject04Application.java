package First.Springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
public class SpringProject04Application {

	@GetMapping("/message")
	public String message(){
		return "Hello World this is Azure spring boot project";


	}
	public static void main(String[] args) {
		SpringApplication.run(SpringProject04Application.class, args);
	}

}
