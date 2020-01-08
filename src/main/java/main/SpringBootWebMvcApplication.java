package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.TestDao;

@SpringBootApplication
public class SpringBootWebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcApplication.class, args);
	}
	
	@Bean
	public TestDao getTestDao() {
		return new TestDao();
	}

}
