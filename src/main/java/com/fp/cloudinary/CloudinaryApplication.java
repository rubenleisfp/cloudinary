package com.fp.cloudinary;

import com.fp.cloudinary.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudinaryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CloudinaryApplication.class, args);
	}

	@Autowired
	CloudinaryService cloudinaryService;

	@Override
	public void run(String... args) throws Exception {
//		Resource resource = new ClassPathResource("images/monkey.jpg");
//
//		// Convertir el recurso a un archivo
//		File imageFile = resource.getFile();
//		cloudinaryService.upload(imageFile,"samples/trash");
	}
}
