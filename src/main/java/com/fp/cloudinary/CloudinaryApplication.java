package com.fp.cloudinary;

import com.fp.cloudinary.service.CloudinaryService;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

@SpringBootApplication
public class CloudinaryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CloudinaryApplication.class, args);
	}

	@Autowired
	CloudinaryService cloudinaryService;

	@Override
	public void run(String... args) throws Exception {
		Resource resource = new ClassPathResource("images/monkey.jpg");

		// Convertir el recurso a un archivo
		File imageFile = resource.getFile();
		cloudinaryService.upload(imageFile,"samples/trash");
	}
}
