
package com.ranaivoson.inligneBiblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ranaivoson.inligneBiblio"})
public class InligneBiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InligneBiblioApplication.class, args);
	}

}
