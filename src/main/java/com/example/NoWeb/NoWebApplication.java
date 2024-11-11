package com.example.NoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import static com.example.NoWeb.Dev.build;

@SpringBootApplication
public class NoWebApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NoWebApplication.class, args);

		//build();

		//Dev obj = new Dev();

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
