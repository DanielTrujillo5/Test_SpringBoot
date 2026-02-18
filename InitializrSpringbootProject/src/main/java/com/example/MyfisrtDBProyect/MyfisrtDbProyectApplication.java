package com.example.MyfisrtDBProyect;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class MyfisrtDbProyectApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello World! spring boot 4 is here";
    } 

	public static void main(String[] args) {
		SpringApplication.run(MyfisrtDbProyectApplication.class, args);
	}

}
