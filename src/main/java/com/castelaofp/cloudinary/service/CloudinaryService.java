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
		Dotenv dotenv = Dotenv.load();
		cloudinary = new Cloudinary(dotenv.get("CLOUDINARY_URL"));
		cloudinary.config.secure = true;
		System.out.println(cloudinary.config.cloudName);
	}

	public String upload(String base64Data) throws IOException {
		Map<String, String> options = new HashMap<String, String>();
		options.put("folder", "indie3");
		
		Map cloudinaryParams = cloudinary.uploader().upload(BASE64_PREFIX + base64Data, options);
		
		LOG.debug("Parametros recibidos de cloudinary:" + cloudinaryParams.toString());
		String url = (String) cloudinaryParams.get("url");
		return url;
	}
}
