package com.italiancoders.postmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PostManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostManagerApplication.class, args);
	}

}
