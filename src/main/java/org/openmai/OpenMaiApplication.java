package org.openmai;

import org.openmai.beans.MAIRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
public class OpenMaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenMaiApplication.class, args);
	}

}
