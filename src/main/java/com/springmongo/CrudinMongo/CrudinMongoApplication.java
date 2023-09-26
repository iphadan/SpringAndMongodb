package com.springmongo.CrudinMongo;

import com.springmongo.CrudinMongo.product.Product;
import com.springmongo.CrudinMongo.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CrudinMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudinMongoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(ProductRepo productRepo){

		return args -> {
			var product= Product.builder().name("iphone").description("smrt phone").build();
			productRepo.insert(product);
		};
}
}
