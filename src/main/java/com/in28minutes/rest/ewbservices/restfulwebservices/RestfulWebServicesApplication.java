package com.in28minutes.rest.ewbservices.restfulwebservices;

import com.in28minutes.rest.ewbservices.restfulwebservices.extra.ArrayOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
        int[] array={1,2,3,4,5};
        ArrayOperation.additionArray(array);

    }
    }
