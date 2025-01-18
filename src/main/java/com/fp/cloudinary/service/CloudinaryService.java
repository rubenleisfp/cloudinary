package com.fp.cloudinary.service;

import java.io.File;
import java.io.IOException;
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
		Dotenv dotenv = Dotenv.load();
		cloudinary = new Cloudinary(dotenv.get("CLOUDINARY_URL"));
		cloudinary.config.secure = true;
		System.out.println(cloudinary.config.cloudName);
	}

	public String upload(File imageFile, String destinatioFolder) throws IOException{
		ImageUtils imageUtils = new ImageUtils();
		String imageToBase64 = imageUtils.imageToBase64(imageFile);
		return this.upload(imageToBase64, destinatioFolder);
	}

	public String upload(String base64Data, String destinationFolder) throws IOException {
		Map<String, String> options = new HashMap<String, String>();
		options.put("folder", destinationFolder);
		//options.put("use_filename", "true");
		options.put("display_name", "monkey.jpg");
		options.put("filename", "monkey.jpg");

		
		Map cloudinaryParams = cloudinary.uploader().upload(BASE64_PREFIX + base64Data, options);
		
		LOG.debug("Parametros recibidos de cloudinary:" + cloudinaryParams.toString());
		String url = (String) cloudinaryParams.get("url");
		return url;
	}
}
