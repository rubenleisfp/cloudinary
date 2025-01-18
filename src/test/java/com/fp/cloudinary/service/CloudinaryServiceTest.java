package com.castelaofp.cloudinary.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.castelaofp.cloudinary.utils.ImageUtils;
import com.cloudinary.Cloudinary;

@SpringBootTest
public class CloudinaryServiceTest {

	@Autowired
	private CloudinaryService cloudinaryService;


	@Test
	public void testUpload() throws IOException {
		// Datos de prueba
		Resource resource = new ClassPathResource("images/monkey.jpg");
		// Convertir el recurso a un archivo
		File imageFile = resource.getFile();

		// Llamada al método que se está probando
		String uploadUrl = cloudinaryService.upload(imageFile,"samples/trash");
		assertNotNull(uploadUrl);
	}
}