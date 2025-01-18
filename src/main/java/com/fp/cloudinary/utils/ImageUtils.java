package com.fp.cloudinary.utils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

public class ImageUtils {

    // Método para convertir una imagen a base64
    public  String imageToBase64(File imageFile) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    // Método para convertir una cadena base64 a una imagen y devolver un File
    public  File base64ToImage(String base64Data, String outputPath) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
}