package com.learn.Finance.controller;


import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.learn.Finance.entity.Subcategory;
import com.learn.Finance.repository.SubcategoryRepository;
import com.learn.Finance.service.FileService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.util.StreamUtils;

@RestController
@CrossOrigin
public class CategoryController {
	@Value("${category.image.path}")
	private String imagePath;
	
	@Autowired
	private SubcategoryRepository subcategoryRepository;
	
	@Autowired
	private FileService fileService;
	
	   //upload user image
	   @PostMapping("subcategories/{subcategoryId}/image")
	   public ResponseEntity<String> uploadUserImage(@RequestParam("categoryImage") MultipartFile image, @PathVariable String subcategoryId) throws IOException, java.io.IOException {
	       String imageName = fileService.uploadFile(image, imagePath);
	        Subcategory subcategory = subcategoryRepository.findById(subcategoryId).get();
	        System.out.println("ImageName"+imageName);
	        subcategory.setCategoryImage(imageName);
	        subcategoryRepository.save(subcategory);
	       return new ResponseEntity<String>("Successs",HttpStatus.ACCEPTED);
	

}

	   @GetMapping(value = "subcategories/{subcategoryId}/image")
	   public void serveUserImage(@PathVariable String subcategoryId, HttpServletResponse response) throws  java.io.IOException {
	       Subcategory subcategory = subcategoryRepository.findById(subcategoryId).get();
	       InputStream resource = fileService.getResource(imagePath, subcategory.getCategoryImage());
	       response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	       StreamUtils.copy(resource, response.getOutputStream());
	   }
}