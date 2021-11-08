package com.dpiat.sportproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan(basePackageClasses = {
		SportProjectApplication.class,
		Jsr310JpaConverters.class
})
public class SportProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportProjectApplication.class, args);
	}

}
