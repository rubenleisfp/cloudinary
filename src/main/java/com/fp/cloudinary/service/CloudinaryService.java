package com.fp.cloudinary.service;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.fp.cloudinary.utils.ImageUtils;
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

		//1. Carga el Dotenv y con el inicia la instancia de cloudinary para poder usar posteriormente
		//en los metodos upload
		throw new UnsupportedOperationException("A implementar por el alumno");
	}

	public String upload(File imageFile, String destinationFolder) throws IOException{
		//1. Transformara el File a un String base 64.
		//2. LLamara al metodo updload de esta clase para que suba el archivo
		throw new UnsupportedOperationException("A implementar por el alumno");
	}

	public String upload(String base64Data, String destinationFolder) throws IOException {
		//1. Crea la options para indicar la carpeta en la cual guardara el fichero
		//2. Llamara a cloudinary para subir el fichero en base 64
		throw new UnsupportedOperationException("A implementar por el alumno");
	}
}
