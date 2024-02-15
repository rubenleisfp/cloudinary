package com.castelafp.cloudinary.service;

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

	private static Logger LOG = LoggerFactory.getLogger(CloudinaryService.class);
	private Cloudinary cloudinary;

	public CloudinaryService() {
		Dotenv dotenv = Dotenv.load();
		cloudinary = new Cloudinary(dotenv.get("CLOUDINARY_URL"));
		cloudinary.config.secure = true;
		System.out.println(cloudinary.config.cloudName);
	}

	public void upload(String base64Data) throws IOException {
		Map<String, String> options = new HashMap<String, String>();
		options.put("folder", "indie3");

		Map upload = cloudinary.uploader().upload("data:image/jpg;base64," + base64Data, options);
		LOG.debug(upload.toString());
	}
}
