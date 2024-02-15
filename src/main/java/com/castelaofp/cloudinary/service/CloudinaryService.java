package com.castelaofp.cloudinary.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;

import io.github.cdimascio.dotenv.Dotenv;

@Service
public class CloudinaryService {

	private static final String BASE64_PREFIX="data:image/jpg;base64,";
	
	private static Logger LOG = LoggerFactory.getLogger(CloudinaryService.class);
	private Cloudinary cloudinary;

	public CloudinaryService() {
		throw new UnsupportedOperationException("Configura aqui la instancia de cloudinary");
	}

	public String upload(String base64Data) throws IOException {
		throw new UnsupportedOperationException("Configura el codigo aqui para subir la imagen a cloudinary");
	}
}
