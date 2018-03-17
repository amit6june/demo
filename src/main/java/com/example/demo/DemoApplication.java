package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class })
@EnableAspectJAutoProxy(proxyTargetClass = true)


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Here??????---->>>>");
		SpringApplication.run(DemoApplication.class, args);


	}
}
