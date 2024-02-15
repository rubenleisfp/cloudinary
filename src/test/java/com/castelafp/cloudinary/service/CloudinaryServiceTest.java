package com.castelafp.cloudinary.service;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.castelafp.cloudinary.utils.ImageUtils;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootTest
public class CloudinaryServiceTest {

	@Autowired
	private CloudinaryService cloudinaryService;

	@MockBean
	private Cloudinary cloudinary;

	@Test
	public void testUpload() throws IOException {
		// Datos de prueba
		Resource resource = new ClassPathResource("images/thumbnail.jpg");

		// Convertir el recurso a un archivo
		File imageFile = resource.getFile();
		ImageUtils imageUtils = new ImageUtils();
		String imageToBase64 = imageUtils.imageToBase64(imageFile);

		// Llamada al método que se está probando
		cloudinaryService.upload(imageToBase64);

	}
}